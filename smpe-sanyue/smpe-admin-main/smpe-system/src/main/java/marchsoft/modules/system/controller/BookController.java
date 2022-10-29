package marchsoft.modules.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marchsoft.modules.system.entity.dto.BookInsertOrUpdateDTO;
import marchsoft.modules.system.service.IBookService;
import marchsoft.response.Result;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/14 18:22
 * @Version 1.0
 **/

@Slf4j
@Api(tags = "系统：图书管理")
@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final IBookService bookService;

    @ApiOperation("新增图书")
    @PostMapping(value = "/add")
    @ApiParam(name = "BookInsertOrUpdateDTO",value = "新增图书参考列表")
    @PreAuthorize("@smpe.check('user:add')")
    public Result<Void> InsertBookWithDetail(@RequestBody BookInsertOrUpdateDTO bookInsertOrUpdateDTO){
        bookService.InsertBookWithDetail(bookInsertOrUpdateDTO);
        return Result.success();
    }

}
