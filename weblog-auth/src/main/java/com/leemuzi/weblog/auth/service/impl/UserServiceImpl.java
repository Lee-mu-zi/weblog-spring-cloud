package com.leemuzi.weblog.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leemuzi.weblog.auth.pojo.DO.UserDO;
import com.leemuzi.weblog.auth.service.UserService;
import com.leemuzi.weblog.auth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 92058
* @description 针对表【t_user(用户表)】的数据库操作Service实现
* @createDate 2024-09-15 19:51:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO>
    implements UserService{

}




