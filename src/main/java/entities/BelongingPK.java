package entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
@Getter
@Setter

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "music_id")
    private Music music;

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(music, that.music) && Objects.equals(playlist, that.playlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(music, playlist);
    }
}
