package com.myself.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myself.mapper.ScheduleMapper;
import com.myself.pojo.Schedule;
import com.myself.service.ScheduleService;
import com.myself.util.PageBean;
import com.myself.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/13 13:02
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;


    @Override
    public R page(Integer pageSize, Integer currentPage) {
        //分页 ，查询

        PageHelper.startPage(currentPage, pageSize);
        List<Schedule> schedules = scheduleMapper.queryPage();
        PageInfo<Schedule> schedulePageInfo = new PageInfo<>(schedules);
        PageBean<Schedule> schedulePageBean = new PageBean<>(currentPage, pageSize, schedulePageInfo.getTotal(), schedulePageInfo.getList());

        return R.ok(schedulePageBean);


    }

    @Override
    public R deleteById(Integer id) {
        int row = scheduleMapper.deleteById(id);
        if (row > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R addSchedule(Schedule schedule) {
        int row = scheduleMapper.addSchedule(schedule);
        if (row > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R changeSchedule(Schedule schedule) {
        if (schedule.getId()==null){
            return R.fail("参数为空，更改被拒绝");
        }
        int row = scheduleMapper.changeSchedule(schedule);
        if (row > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }
}
