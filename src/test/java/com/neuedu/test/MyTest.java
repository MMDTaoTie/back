package com.neuedu.test;

import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import com.neuedu.util.DESUTIL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    UserService userService;
    @Test
    public void method(){
        User user = new User();
        user.setName("青鱼");
        user.setPassword(DESUTIL.encode("abcdefg"));
        user.setLoginId("admin");
        user.setSex(1);
        user.setPhone("15833645978");
        user.setEmail("ahbc@163.com");
        user.setCreateDate(new Date());
        System.out.println(userService.add(user));
    }
}
