package tweteroo.api.dtos;

import jakarta.validation.constraints.NotNull;

public class TweetDTO {
    @NotNull(message = "username is required!")
    private String username;

    @NotNull(message = "text is required!")
    private String text;

    public TweetDTO(){};

    public TweetDTO(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
