package com.test.rest;

import com.test.exception.NoSuchPaymentRequestException;
import com.test.exception.RequestAlreadyExistException;
import com.test.rest.dto.ErrorDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Objects;


//Handle application errors and return appropriate error response

@ControllerAdvice
@Slf4j
class RestResponseEntityExceptionHandler {

}