package com.myself.mapper;

import com.myself.pojo.Employee;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/11 19:35
 */
public interface EmpMapper {
    //查询所有员工信息
    List<Employee> findAll();
}
