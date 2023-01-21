package tweteroo.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import tweteroo.api.dtos.TweetDTO;
import tweteroo.api.repositories.UserRepository;

@Data
@Entity(name = "Tweets")
@NoArgsConstructor
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String text;
    private String avatar;

    public Tweet(TweetDTO data, UserRepository repository) {
        this.username = data.getUsername();
        this.text = data.getText();
        setAvatar(repository);
    }

    public void setAvatar(UserRepository repository) {
        User user = repository.findByName(this.username);
        this.avatar = user.getAvatar();
    }
}
