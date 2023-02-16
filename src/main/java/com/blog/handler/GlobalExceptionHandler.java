package com.blog.handler;

import com.blog.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

/*    @ExceptionHandler(value = IllegalArgumentException.class)
    public String handleException(IllegalArgumentException exception) {

        return "<h1>" + exception.getMessage()+"</h1>";
    }*/

    @ExceptionHandler(value = Exception.class)
    public ResponseDTO<String> handleException(Exception exception) {
        return new ResponseDTO<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage());

    }

}
