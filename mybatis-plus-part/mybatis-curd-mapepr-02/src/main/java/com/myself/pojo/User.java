package com.myself.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 14:39
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    //    @TableField(value = "email", exist = false)
    private String email;
    @TableLogic
    private int deleted;
    @Version
    private Integer version;

}
