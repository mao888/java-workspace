package marchsoft.modules.system.service;

import marchsoft.modules.system.entity.dto.BookInsertOrUpdateDTO;

// 图书服务类
public interface IBookService {
    /**
     * @Author HuChao
     * @Description
     * @Date 18:28 2021/11/14
     * @Param
     * @return
     **/
    void InsertBookWithDetail(BookInsertOrUpdateDTO bookInsertOrUpdateDTO);

}
