package cat.tecnocampus.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Album {
    @Id
    private Integer id;
    private String title;
    private LocalDateTime releaseDate;
    private String description;


    public Album(Integer id, String title, LocalDateTime releaseDate, String description) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;
    }

    public Album() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
