package tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.models.Tweet;
import tweteroo.api.repositories.TweetRepository;

@Service
public class TweetService {

    @Autowired
    TweetRepository repository;

    public void insert(TweetDTO tweetDTO) {
        repository.save(new Tweet(tweetDTO));
    }
}
