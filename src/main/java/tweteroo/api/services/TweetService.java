package tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.models.Tweet;
import tweteroo.api.repositories.TweetRepository;
import tweteroo.api.repositories.UserRepository;

import java.util.List;

@Service
public class TweetService {

    @Autowired
    TweetRepository repository;

    @Autowired
    UserRepository userRepository;

    public void insert(TweetDTO tweetDTO) {
        repository.save(new Tweet(tweetDTO, userRepository));
    }

    public List<Tweet> getTweets(Integer page) {
        int filter = ( page - 1) * 5;
        return repository.filterByPage(filter);
    }
}
