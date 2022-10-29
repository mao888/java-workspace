package marchsoft.modules.system.mapper;


import marchsoft.base.BasicMapper;
import marchsoft.modules.system.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Component;

@Component
@CacheConfig(cacheNames = "book")
public interface BookMapper extends BasicMapper<Book> {
    /**
     * @Author HuChao
     * @Description //
     * @Date 18:52 2021/11/14
     * @Param
     * @return
     **/
}
