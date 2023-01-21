package tweteroo.api.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.services.TweetService;

@RestController
@RequestMapping(value = "/")
public class TweetController {

    @Autowired
    TweetService service;

    @PostMapping(value = "/tweets")
    public ResponseEntity<String> post(@Valid @RequestBody TweetDTO tweetDTO) {
        service.insert(tweetDTO);
        return new ResponseEntity("OK", HttpStatus.CREATED);
    }
}
