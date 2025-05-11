package com.myself.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/10 19:01
 */
@Data
public class User {

    @NotBlank
    private String name;
    @Length(min = 6)
    private String password;
    @Min(6)
    private int age;
    @Email
    private String email;
    @Past
    private Date birthday;

}
