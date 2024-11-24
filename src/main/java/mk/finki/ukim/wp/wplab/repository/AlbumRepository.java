package mk.finki.ukim.wp.wplab.repository;

import mk.finki.ukim.wp.wplab.bootstrap.DataHolder;
import mk.finki.ukim.wp.wplab.model.Album;
import mk.finki.ukim.wp.wplab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    public List<Album> findAll()
    {
        return new ArrayList<>(DataHolder.albums);
    }

    public Album findById(Long id)
    {
        return DataHolder.albums.stream().filter(x-> x.getId().equals(id)).findFirst().get();
    }
}
