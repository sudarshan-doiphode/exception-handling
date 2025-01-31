package dev.darsh.technique1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException{

    private ErrorResponse errorResponse;

}
