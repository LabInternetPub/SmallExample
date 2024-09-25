package cat.tecnocampus.example.api;

import cat.tecnocampus.example.application.AlbumService;
import cat.tecnocampus.example.domain.Album;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumAPI {

    private final AlbumService albumService;

    public AlbumAPI(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Mataró!";
    }

    @GetMapping("/albums")
    public List<Album> getAlbums() {
        return albumService.getAlbums();
    }

    @GetMapping("/albums/{id}")
    public Album getAlbumById(@PathVariable Integer id) {
        return albumService.getAlbumById(id);
    }

    @GetMapping("/albums/title/{title}")
    public List<Album> getAlbumByTitle(@PathVariable String title) {
        return albumService.getAlbumByTitle(title);
    }

    @PostMapping("/albums")
    public Album addAlbum(@RequestBody Album album) {
        return albumService.addAlbum(album);
    }

}
