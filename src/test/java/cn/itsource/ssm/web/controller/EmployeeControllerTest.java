package cn.itsource.ssm.web.controller;

import cn.itsource.ssm.service.IEmpolyeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeControllerTest {

    @Autowired
    private IEmpolyeeService empolyeeService;
    @Test
    public void findOne() {
        empolyeeService.findOne(3L);
    }
}