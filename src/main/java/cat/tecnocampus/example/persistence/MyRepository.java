package cat.tecnocampus.example.persistence;

import cat.tecnocampus.example.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyRepository extends JpaRepository<Album, Integer> {
    List<Album> findByTitle(String title);
}
