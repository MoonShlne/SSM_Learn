package com.myself.service.impl;

import com.myself.mapper.EmpMapper;
import com.myself.pojo.Employee;
import com.myself.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.channels.Pipe;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/11 19:42
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Employee> findAll() {
        return empMapper.findAll();
    }
}
