package mk.finki.ukim.wp.wplab.repository;

import mk.finki.ukim.wp.wplab.bootstrap.DataHolder;
import mk.finki.ukim.wp.wplab.model.Artist;
import mk.finki.ukim.wp.wplab.model.Song;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

//    public final List<Song> songs = new ArrayList<>();

    private Long id;
    public SongRepository() {
        id = 0L;
//        songs.add(new Song("Acc", "Accordion", "Rap", 2004));
//        songs.add(new Song("DIAND", "Devil In a New Dress", "Rap", 2010));
//        songs.add(new Song("MB", "Fried", "Rap", 2024));
//        songs.add(new Song("TPAB", "How Much a Dollar Cost", "Rap", 2015));
//        songs.add(new Song("KSG", "Cudi Montage", "Rap", 2018));
    }

    public List<Song> findAll()
    {
        return new ArrayList<>(DataHolder.songs);
    }

    public Song findByTrackId(String trackId)
    {
        return DataHolder.songs.stream().filter(x-> x.getTrackId().equals(trackId)).findFirst().get();
    }

    public Artist addArtistToSong(Artist artist, Song song)
    {
        song.getPerformers().add(artist);
        return artist;
    }

    public void add(String trackId, String title, String genre,
                    int releaseYear, Long album)
    {
        DataHolder.songs.add(new Song(id++, trackId,title,genre,releaseYear,album));
    }

    public Song findById(Long songId)
    {
        return DataHolder.songs.stream().filter(x-> x.getId().equals(songId)).findFirst().get();
    }

    public void edit(Long songId, String trackId, String title, String genre, int releaseYear, Long albumId) {
        Song song = DataHolder.songs.stream().filter(x->x.getId().equals(songId)).findFirst().get();
        song.setTrackId(trackId);
        song.setTitle(title);
        song.setGenre(genre);
        song.setReleaseYear(releaseYear);
        song.setAlbumId(albumId);
    }

    public void delete(Long songId) {
        Song song = DataHolder.songs.stream().filter(x->x.getId().equals(songId)).findFirst().get();
        DataHolder.songs.remove(song);
    }
}
