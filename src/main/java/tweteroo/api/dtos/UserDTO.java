package tweteroo.api.dtos;

import jakarta.validation.constraints.NotNull;

public class UserDTO {
    @NotNull(message = "username is required!")
    private String username;

    @NotNull(message = "avatar is required!")
    private String avatar;

    public UserDTO(){};

    public UserDTO(String username, String avatar) {
        this.username = username;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
