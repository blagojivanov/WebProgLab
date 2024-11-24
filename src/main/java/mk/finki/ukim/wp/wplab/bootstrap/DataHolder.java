package mk.finki.ukim.wp.wplab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.wp.wplab.model.Album;
import mk.finki.ukim.wp.wplab.model.Artist;
import mk.finki.ukim.wp.wplab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> artists;
    public static List<Song> songs;

    public static List<Album> albums;
    @PostConstruct
    public void init()
    {
        artists = new ArrayList<>();
        songs = new ArrayList<>();
        albums = new ArrayList<>();

        albums.add(new Album(1L,"Madvillainy", "Rap", "2004"));
        albums.add(new Album(2L,"MBDTF", "Rap", "2010"));
        albums.add(new Album(3L,"We don't trust you", "Rap", "2024"));
        albums.add(new Album(4L,"Kids See Ghosts", "Rap", "2018"));
        albums.add(new Album(5L,"To pimp a butterfly", "Rap", "2004"));

        artists.add(new Artist(1L, "Kanye", "West", "GOAT"));
        artists.add(new Artist(2L, "Kendrick", "Lamar", "Pulitzer prize winner"));
        artists.add(new Artist(3L, "Metro", "Boomin", "Prod god"));
        artists.add(new Artist(4L, "Jermaine", "Cole", "Izguben"));
        artists.add(new Artist(5L, "MetalFingers", "DOOM", "Rip"));

        songs.add(new Song(1L,"Acc", "Accordion", "Rap", 2004, 1L));
        songs.add(new Song(2L,"DIAND", "Devil In a New Dress", "Rap", 2010, 2L));
        songs.add(new Song(3L, "MB", "Fried", "Rap", 2024, 3L));
        songs.add(new Song(4L, "TPAB", "How Much a Dollar Cost", "Rap", 2015, 5L));
        songs.add(new Song(5L, "KSG", "Cudi Montage", "Rap", 2018, 4L));
    }
}
