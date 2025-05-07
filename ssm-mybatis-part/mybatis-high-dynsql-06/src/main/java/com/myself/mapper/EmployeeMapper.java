package com.myself.mapper;

import com.myself.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 16:53
 */
public interface EmployeeMapper {
    //根据姓名和薪水查询员工
    List<Employee> queryList(@Param("name") String name, @Param("salary") Double salary);
    //更新数据 ，要求传入的name 和salary 不为null

    int updateEmp(Employee employee);


    //批量操作
    //批量查询
    List<Employee> queryByListId(@Param("list") List<Integer> list);

    //批量删除
    int deleteByListId(@Param("list") List<Integer> list);

    //批量增加
    int insertByListId (@Param("list") List<Employee> list);

    //批量修改
    int updateByListId (@Param("list") List<Employee> list);



}


