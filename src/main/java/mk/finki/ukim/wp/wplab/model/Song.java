package mk.finki.ukim.wp.wplab.model;

import lombok.Data;
import lombok.Getter;
import mk.finki.ukim.wp.wplab.bootstrap.DataHolder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Data
public class Song {

    Long id;
    String trackId;
    String title;
    String genre;
    int releaseYear;
    List<Artist> performers;

    Long albumId;
    private Album album;

    public Song(Long id, String trackId, String title, String genre, int releaseYear, Long albumId) {
        this.id = id;
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = new ArrayList<>();
        this.album = DataHolder.albums.stream().filter(x-> x.id.equals(albumId)).findFirst().get();
    }

}
