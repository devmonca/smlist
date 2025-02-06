package entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
@Getter
@Setter

@Entity
@Table(name = "tb_playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;

    public Playlist(){}

    public Playlist(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(id, playlist.id) && Objects.equals(title, playlist.title) && Objects.equals(author, playlist.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: "+ title + "\n");
        sb.append("Artist: "+ author + "\n");
        return sb.toString();
    }
}
