package com.myself.test;

import com.myself.config.JavaConfig;
import com.myself.service.StudentService;
import com.myself.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/1 14:57
 */
@SpringJUnitConfig(JavaConfig.class)
public class springTxTest {
    @Autowired
    private StudentService service;
    @Autowired
    private TopService topService;

    @Test
    public void test() throws FileNotFoundException {
        service.changeInfo();
    }

    @Test
    public void test2() {
        topService.topService();
        ;
    }
}
