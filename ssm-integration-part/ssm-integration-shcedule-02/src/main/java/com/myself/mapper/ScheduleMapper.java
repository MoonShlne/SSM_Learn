package com.myself.mapper;

import com.myself.pojo.Schedule;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/13 13:06
 */

public interface ScheduleMapper {


    List<Schedule> queryPage();

    int deleteById(Integer id);

     int addSchedule(Schedule schedule);

    int changeSchedule(Schedule schedule);
}
