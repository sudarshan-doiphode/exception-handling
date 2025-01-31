package dev.darsh.technique2.exception;

import dev.darsh.technique2.response.ErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NotValidUserException extends RuntimeException{

    private ErrorResponse errorResponse;

}
