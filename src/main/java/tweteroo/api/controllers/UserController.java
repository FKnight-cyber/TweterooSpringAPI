package tweteroo.api.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tweteroo.api.dtos.UserDTO;
import tweteroo.api.services.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping(value = "/sign-up")
    public ResponseEntity<String> register(@Valid @RequestBody UserDTO userDTO) {
        service.insert(userDTO);
        return new ResponseEntity("OK", HttpStatus.CREATED);
    }
}
