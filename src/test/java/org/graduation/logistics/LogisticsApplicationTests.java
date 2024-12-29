package org.graduation.logistics;

import jakarta.annotation.Resource;
import org.graduation.logistics.dao.AddressDao;
import org.graduation.logistics.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogisticsApplicationTests {
    @Resource
    private UserDao userDao;
    @Resource
    private AddressDao addressDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.selectUserBoByUserId(1, (byte) 1));
    }
    @Test
    void addressDaoTest(){
//        System.out.println(addressDao.selectAddressesBoByUserIdType(1, (byte) 1, (byte) 1));
//        System.out.println(addressDao.selectAddressesBoByUserIdType(1, (byte) 1, (byte) 0));
//        System.out.println(addressDao.selectAddressesBoByUserIdType(1, (byte) 0, (byte) 1));
    }

}
