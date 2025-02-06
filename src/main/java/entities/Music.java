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
@Table(name = "tb_music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String title;

    @Column(name = "music_year")
    private Integer year;
    private String artist;
    private String imgUrl;
    private String genre;

    public Music(){}

    public Music(Long id, String title, Integer year, String artist, String imgUrl, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.artist = artist;
        this.imgUrl = imgUrl;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(id, music.id) && Objects.equals(title, music.title) && Objects.equals(year, music.year) && Objects.equals(artist, music.artist) && Objects.equals(imgUrl, music.imgUrl) && Objects.equals(genre, music.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, artist, imgUrl, genre);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: "+ title + "\n");
        sb.append("Artist: "+ artist + "\n");
        sb.append("Genre: "+ genre + "\n");
        sb.append("Year: "+ year + "\n");
        return sb.toString();
    }
}
