package tweteroo.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.dtos.UserDTO;
import tweteroo.api.models.Tweet;
import tweteroo.api.models.User;
import tweteroo.api.repositories.TweetRepository;
import tweteroo.api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public void run(String ...args) throws Exception {

        User newUser = new User(new UserDTO("fulano", "sem avatar"));
        User newUser2 = new User(new UserDTO("beltrano", "com avatar"));

        userRepository.save(newUser);
        userRepository.save(newUser2);

        for(int i = 1; i <= 10; i++) {
            Tweet newTweet = new Tweet(new TweetDTO("fulano", "tweet número " + i), userRepository);
            tweetRepository.save(newTweet);
        }

        for(int i = 11; i <= 20; i++) {
            Tweet newTweet = new Tweet(new TweetDTO("beltrano", "tweet número " + i), userRepository);
            tweetRepository.save(newTweet);
        }
    }

}
