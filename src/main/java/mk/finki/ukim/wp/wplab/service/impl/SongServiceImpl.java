package mk.finki.ukim.wp.wplab.service.impl;

import mk.finki.ukim.wp.wplab.model.Artist;
import mk.finki.ukim.wp.wplab.model.Song;
import mk.finki.ukim.wp.wplab.repository.SongRepository;
import mk.finki.ukim.wp.wplab.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId);
    }

    @Override
    public void save(String title, String genre, int releaseYear, String trackId, Long albumId) {
        songRepository.add(trackId, title, genre, releaseYear, albumId);
    }

    @Override
    public Song findById(Long songId) {
        return songRepository.findById(songId);
    }

    @Override
    public void edit(Long songId, String title, String genre, int releaseYear, String trackId, Long albumId) {
        songRepository.edit(songId, trackId, title, genre, releaseYear, albumId);
    }

    @Override
    public void delete(Long songId) {
        songRepository.delete(songId);
    }
}
