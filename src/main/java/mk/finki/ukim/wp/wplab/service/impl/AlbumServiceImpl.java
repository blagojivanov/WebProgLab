package mk.finki.ukim.wp.wplab.service.impl;

import mk.finki.ukim.wp.wplab.model.Album;
import mk.finki.ukim.wp.wplab.repository.AlbumRepository;
import mk.finki.ukim.wp.wplab.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }
}
