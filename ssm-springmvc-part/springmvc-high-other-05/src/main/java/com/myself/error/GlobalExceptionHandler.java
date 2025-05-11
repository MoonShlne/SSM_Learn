package com.myself.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/10 15:00
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public Object handler(ArithmeticException arithmeticException) {
        return arithmeticException.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public Object exception(Exception e) {
        return e.getMessage();
    }
}
