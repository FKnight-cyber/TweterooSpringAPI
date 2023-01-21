package tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tweteroo.api.dtos.UserDTO;
import tweteroo.api.models.User;
import tweteroo.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void insert(UserDTO userDTO) {
        User newUser = new User(userDTO);
        repository.save(newUser);
    }
}
