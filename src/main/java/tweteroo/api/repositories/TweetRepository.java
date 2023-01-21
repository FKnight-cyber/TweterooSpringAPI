package tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tweteroo.api.models.Tweet;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Query("SELECT t FROM Tweets t ORDER BY t.id DESC LIMIT 5 OFFSET :page")
    List<Tweet> filterByPage(@Param("page") int page);

    @Query("SELECT t FROM Tweets t WHERE t.username LIKE :name ORDER BY t.id DESC")
    List<Tweet> findByName(@Param("name") String name);
}
