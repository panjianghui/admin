package com.pjh.admin;

import com.pjh.admin.base.CacheUtils;
import com.pjh.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class jdbcTest {
//    private Logger logger = Logger.getLogger(getClass());
@Autowired
CacheUtils redisBusiness;
    @Autowired
    private UserService userSerivce;
    @Test
    public void testcreate(){

        redisBusiness.set("test", "2");
        System.out.println(redisBusiness.get("test"));
//        log.info("测试输出日志");

//        userSerivce.create("ming",1);
    }
}
