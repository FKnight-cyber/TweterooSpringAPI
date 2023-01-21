package tweteroo.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import tweteroo.api.dtos.TweetDTO;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String avatar;
    @Column(nullable = false)
    private String text;

    public Tweet(TweetDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();
        this.text = data.text();
    }
}
