package dev.darsh.technique1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class ExceptionHandlerController {

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getUser(@PathVariable Integer id){
        if(id>100){
            throw new UserNotFoundException(ErrorResponse.builder()
                    .message("User is not available , We have only 1-100 Users in our system")
                    .timestamp(LocalDateTime.now())
                    .status(HttpStatus.NOT_FOUND)
                    .statusCode(HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()))
                    .build());
        }
        else {
            return ResponseEntity.ok("Hello User");
        }
    }


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerUserNotFoundException(UserNotFoundException e){
        log.error("Handling user not found exception");
        return new ResponseEntity<>(e.getErrorResponse(), HttpStatus.NOT_FOUND);
    }
}
