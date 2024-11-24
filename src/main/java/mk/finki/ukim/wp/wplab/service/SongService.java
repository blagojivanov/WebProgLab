package mk.finki.ukim.wp.wplab.service;

import mk.finki.ukim.wp.wplab.model.Album;
import mk.finki.ukim.wp.wplab.model.Artist;
import mk.finki.ukim.wp.wplab.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongService{
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findByTrackId(String trackId);
    void save( String title, String genre, int releaseYear, String trackId, Long albumId);
    Song findById(Long songId);
    void edit(Long songId, String title, String genre, int releaseYear, String trackId, Long albumId);
    void delete(Long songId);
}