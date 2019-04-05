package cn.itsource.ssm.service.impl;

import cn.itsource.ssm.domain.Employee;
import cn.itsource.ssm.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void add() {
        Employee employee = new Employee();
        employee.setName("小王");
        employee.setPsw("fsdf46456");
        employeeMapper.add(employee);
    }

    @Test
    public void findOne() {
        employeeMapper.findOne(1L);
    }

    @Test
    public void findAll() {
    }
}