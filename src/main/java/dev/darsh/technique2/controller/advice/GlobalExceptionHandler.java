package dev.darsh.technique2.controller.advice;

import dev.darsh.technique2.exception.NotValidUserException;
import dev.darsh.technique2.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotValidUserException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(NotValidUserException ex){
        log.error("Handling user not found exception inside handleUserNotFoundException() method");
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message("User not found with given parameter ❌")
                .status(HttpStatus.NOT_FOUND)
                .statusCode(HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()))
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
