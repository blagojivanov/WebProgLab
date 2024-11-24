package mk.finki.ukim.wp.wplab.model;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Album {

    Long id;
    String name;
    String genre;
    String releaseYear;

    public Album(Long id, String name, String genre, String releaseYear) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}
