package tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tweteroo.api.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM Users u WHERE u.username LIKE :name")
    User findByName(@Param("name") String name);
}
