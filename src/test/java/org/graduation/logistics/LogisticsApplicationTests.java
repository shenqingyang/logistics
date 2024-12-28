package org.graduation.logistics;

import jakarta.annotation.Resource;
import org.graduation.logistics.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogisticsApplicationTests {
    @Resource
    private UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.selectUserBoByUserIdAndLanguage(1,1));
    }

}
