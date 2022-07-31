package cn.tedu.csmall.product.ex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
@Slf4j
@RestControllerAdvice
//加了此注解的类中的方法，会干预每一次请求
public class GlobalExceptionHandler {

    @ExceptionHandler
    public String handleServiceException(ServiceException e){
        return e.getMessage();
    }

    @ExceptionHandler
    public String handleBindException(BindException e){
        log.debug("BindException:{}",e.getMessage());
        StringBuilder stringBuilder = new StringBuilder();
        List<FieldError> fieldErrors = e.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            String message = fieldError.getDefaultMessage();
            stringBuilder.append(message);
        }
        return stringBuilder.toString();
    }


    @ExceptionHandler
    public String handleThrowable(Throwable e){
        e.printStackTrace();
        return "程序运行错误";

    }
}
