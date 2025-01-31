package dev.darsh.technique2.controller;

import dev.darsh.technique1.UserNotFoundException;
import dev.darsh.technique2.exception.NotValidUserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/demo/{id}")
    public ResponseEntity<String> greet(@PathVariable Integer id) {
        if (id > 100) {
            throw new NotValidUserException();
        } else {
            return ResponseEntity.ok("Hello User");
        }
    }
}
