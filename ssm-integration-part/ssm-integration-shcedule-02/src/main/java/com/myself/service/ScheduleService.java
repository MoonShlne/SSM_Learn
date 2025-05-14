package com.myself.service;

import com.myself.pojo.Schedule;
import com.myself.util.R;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/13 12:38
 */
public interface ScheduleService {


    R page(Integer pageSize, Integer currentPage);

    R deleteById(Integer id);

    R addSchedule(Schedule schedule);

    R changeSchedule(Schedule schedule);
}
