package com.employee.employeeproject.exception;

import com.employee.employeeproject.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ResponseDto> handleMethodArgumentNotValidException(ValidationException exception) {
        ResponseDto responseDto = new ResponseDto("Exception while parsing Rest request", exception.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
    }
}
