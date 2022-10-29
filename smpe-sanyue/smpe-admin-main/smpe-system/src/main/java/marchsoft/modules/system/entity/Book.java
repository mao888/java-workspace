package marchsoft.modules.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import marchsoft.base.BasicModel;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/14 18:32
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "Book对象",description = "图书")
@TableName("book")
public class Book extends BasicModel<Book> {

    @ApiModelProperty(value = "ID")
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "图书名称")
    private String bookName;

    @ApiModelProperty(value = "图书数量")
    private Integer quantity;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(bookName, book.bookName) && Objects.equals(quantity, book.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, bookName, quantity);
    }
}
