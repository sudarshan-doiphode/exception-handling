package dev.darsh.technique1;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
    private HttpStatus status;
    private HttpStatusCode statusCode;
}
