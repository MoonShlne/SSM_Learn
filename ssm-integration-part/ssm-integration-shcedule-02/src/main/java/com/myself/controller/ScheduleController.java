package com.myself.controller;

import com.myself.pojo.Schedule;
import com.myself.service.ScheduleService;
import com.myself.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/13 12:38
 */
@Controller
@RequestMapping("schedule")
@ResponseBody
@Slf4j
@CrossOrigin  //解决跨域问题
public class ScheduleController {
    @Autowired
    private ScheduleService service;

    @GetMapping("{pageSize}/{currentPage}")
    public R getSchedule(@PathVariable Integer pageSize,
                         @PathVariable Integer currentPage) {

        R r = service.page(pageSize, currentPage);
        //sl4fj
        log.info("查询数据为：{}", r);
        return r;

    }

    @DeleteMapping("{id}")
    public R deleteSchedule(@PathVariable Integer id) {
        R r = service.deleteById(id);
        return r;
    }


    @PostMapping
    public R addSchedule(@RequestBody @Validated Schedule schedule, BindingResult result) {
        if (result.hasErrors()) {
            return R.fail("参数为null");
        }
        R r = service.addSchedule(schedule);
        return r;
    }

    @PutMapping
    public R changeSchedule(@RequestBody @Validated Schedule schedule, BindingResult result) {
        if (result.hasErrors()) {
            return R.fail("参数为空");
        }
        R r = service.changeSchedule(schedule);
        return r;
    }

}
