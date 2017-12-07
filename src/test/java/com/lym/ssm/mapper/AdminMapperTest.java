package com.lym.ssm.mapper;

import com.lym.ssm.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;



/**
 * Created by dllo on 17/12/2.
 */
@ContextConfiguration("classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminMapperTest {

    @Resource
    private AdminMapper adminMapper;

    @Test
    public void findAll() throws Exception {
        Admin admin = new Admin();
        admin.setAdminCode("admin");
        admin.setPassword("123");
        adminMapper.findAll(admin).forEach(System.out::println);
    }

}