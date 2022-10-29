package marchsoft.modules.system.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName BookInsertOrUpdateDTO
 * @Description 新增或修改图示
 * @Author Huchao
 * @Date 2021/11/14 18:44
 * @Version 1.0
 **/
@Data
@ApiModel
public class BookInsertOrUpdateDTO {

    @ApiModelProperty(value = "图书名称")
    private String bookName;

    @ApiModelProperty(value = "图书数据")
    private Integer quantity;

}
