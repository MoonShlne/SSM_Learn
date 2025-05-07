package com.myself.mapper;

import com.myself.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/2 17:17
 * 定义方法信息
 */
public interface EmployeeMapper {
    Employee queryById(Integer id);

    int insertUser(Employee employee);

    List<Employee> queryBySalary(Double salary);

    List<Employee> queryByNameAndSalary(@Param("1") String name,@Param("2") Double salary);
}
