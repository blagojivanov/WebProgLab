package mk.finki.ukim.wp.wplab.model;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Artist {
    Long id;
    String firstName;
    String lastName;
    String bio;

    public Artist(Long id, String firstName, String lastName, String bio) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

}
