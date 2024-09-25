package cat.tecnocampus.example.application;

import cat.tecnocampus.example.domain.Album;
import cat.tecnocampus.example.persistence.MyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {
    private final List<Album> albumList;
    private final MyRepository myRepository;

    public AlbumService(MyRepository myRepository) {
        this.myRepository = myRepository;
        this.albumList = new ArrayList<>();
        this.albumList.add(new Album(1, "Album 1", LocalDateTime.now(), "Description 1"));
        this.albumList.add(new Album(3, "Album 3", LocalDateTime.now(), "Description 3"));
        myRepository.saveAll(albumList);

    }

    public List<Album> getAlbums() {
        return myRepository.findAll();
    }

    public Album addAlbum(Album album) {
        albumList.add(album);
        myRepository.save(album);
        return album;
    }

    public Album getAlbumById(Integer id) {
        return myRepository.findById(id).get();
    }

    public List<Album> getAlbumByTitle(String title) {
        return myRepository.findByTitle(title);
    }
}
