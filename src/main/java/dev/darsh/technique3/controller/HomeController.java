package dev.darsh.technique3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class HomeController {

    @GetMapping("/technique3/{id}")
    public ResponseEntity<String> greet(@PathVariable Integer id){
        if(id>100){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry you have entered wrong input ❌");
        }
        else {
            return ResponseEntity.ok("Hello User 😊");
        }
    }
}
