package marchsoft.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marchsoft.base.BasicServiceImpl;
import marchsoft.enums.ResultEnum;
import marchsoft.exception.BadRequestException;
import marchsoft.modules.system.entity.Book;
import marchsoft.modules.system.entity.Role;
import marchsoft.modules.system.entity.dto.BookInsertOrUpdateDTO;
import marchsoft.modules.system.mapper.BookMapper;
import marchsoft.modules.system.service.IBookService;
import marchsoft.utils.SecurityUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/14 18:57
 * @Version 1.0
 **/
@Slf4j
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "book")
public class BookServiceImpl extends BasicServiceImpl<BookMapper,Book> implements IBookService {
    private final BookMapper bookMapper;

    /**
     * 新增图书
    */
    @Override
    public void InsertBookWithDetail(BookInsertOrUpdateDTO bookInsertOrUpdateDTO) {
        final LambdaQueryWrapper<Book> BookLambdaQueryWrapper = new LambdaQueryWrapper<>();
        // 判断书名不能重复
        BookLambdaQueryWrapper.eq(Book::getBookName,bookInsertOrUpdateDTO.getBookName());
        System.out.println("判断是否有重复数量:"+this.count(BookLambdaQueryWrapper));
        if (count(BookLambdaQueryWrapper)>0){
            log.error(StrUtil.format("【新增图书失败】操作人id：{}，图书名已存在 book:{}", SecurityUtils.getCurrentUserId(),
                    bookInsertOrUpdateDTO.getBookName()));
            throw new BadRequestException("已存在："+bookInsertOrUpdateDTO.getBookName());
        }
        // 属性拷贝
        final Book book = new Book();
        BeanUtil.copyProperties(bookInsertOrUpdateDTO,book);
        final boolean save = save(book);
        // 新增图书 此方法为bookMapper.insert(book);
        if (!save){
            log.error(StrUtil.format("【新增图书失败】操作人id:{}，图书名已存在 book:{}",SecurityUtils.getCurrentUserId(),
                    bookInsertOrUpdateDTO.getBookName()));
            throw new BadRequestException(ResultEnum.INSERT_OPERATION_FAIL);
        }
        log.info(StrUtil.format("【新增图书成功】操作人id：{}，图书名称：{}"),SecurityUtils.getCurrentUserId(),
                bookInsertOrUpdateDTO.getBookName());
    }
}
