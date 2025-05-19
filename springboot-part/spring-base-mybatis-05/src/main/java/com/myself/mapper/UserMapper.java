package com.myself.mapper;
import com.myself.pojo.User;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/16 16:54
 */
public interface UserMapper {
    List<User> findAll();

    Integer delete(int id);
}
