package com.myself.mapper;

import com.myself.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/3 15:23
 */
public interface EmployeeMapper {
    Integer deleteEmployee(Integer id);

    String queryById(Integer id);

    Double queryByIdSalary(Integer id);

    Employee queryEmployeeById(Integer id);

    /**
     * 查询高工资和平均工资
     * @return Map 当没有pojo类时，就用map接值
     */
    Map<String, Objects>  selectEmpNameAndMaxSalary();

    /**
     * 查询所有员工信息
     * @return  list集合
     */
    List<Employee> queryAll();

    int insertEmp(Employee employee);
}
