package com.leemuzi.weblog.auth;

import com.leemuzi.framework.common.utils.JsonUtil;
import com.leemuzi.weblog.auth.mapper.UserMapper;
import com.leemuzi.weblog.auth.pojo.DO.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WeblogAuthApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelect() {
        UserDO userDO = userMapper.selectById(1L);
        log.info("userDO:{}", JsonUtil.toJsonString(userDO));
    }

}
