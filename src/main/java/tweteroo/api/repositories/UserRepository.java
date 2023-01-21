package tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tweteroo.api.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
