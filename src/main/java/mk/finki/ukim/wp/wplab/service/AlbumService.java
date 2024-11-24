package mk.finki.ukim.wp.wplab.service;

import mk.finki.ukim.wp.wplab.model.Album;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlbumService {

    List<Album> findAll();

}
