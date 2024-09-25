package com.leemuzi.weblog.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leemuzi.weblog.auth.pojo.DO.UserDO;

/**
* @author 92058
* @description 针对表【t_user(用户表)】的数据库操作Mapper
* @createDate 2024-09-15 19:51:30
* @Entity com.leemuzi.weblog.auth.pojo.DO.UserDO
*/

public interface UserMapper extends BaseMapper<UserDO> {
    /**
     * 根据主键 ID 查询
     * @param id
     * @return
     */

    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据主键 ID 删除
     * @param id
     * @return
     */
//    int deleteByPrimaryKey(Long id);

    /**
     * 插入记录
     * @param record
     * @return
     */
//    int insert(UserDO record);

    /**
     * 更新记录
     * @param record
     * @return
     */
//    int updateByPrimaryKey(UserDO record);
}




