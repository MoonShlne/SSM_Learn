package com.myself.controller;

import com.myself.pojo.Employee;
import com.myself.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/11 19:52
 */
@Controller
@ResponseBody
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private  EmployeeService employeeService;
@RequestMapping("find")

    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
