package tweteroo.api.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.models.Tweet;
import tweteroo.api.services.TweetService;

import java.util.List;

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

    @GetMapping(value = "/tweets")
    public List<Tweet> getTweets(@RequestParam(required = false) Integer page, String username) {
        System.out.println(username);
        if(username != null) {
            return service.getUserTweets(username);
        }
        if(page == null){
            return service.getTweets(1);
        }else{
            return service.getTweets(page);
        }
    }
}
