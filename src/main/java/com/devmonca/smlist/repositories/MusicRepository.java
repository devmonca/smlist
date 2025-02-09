package com.devmonca.smlist.repositories;

import com.devmonca.smlist.entities.Music;
import com.devmonca.smlist.projection.MusicMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music, Long> {
    @Query(nativeQuery = true, value = """
            SELECT tb_music.id, tb_music.title, tb_music.artist, tb_music.genre ,tb_music.music_year AS musicYear, tb_music.img_url AS imgUrl,
            tb_belonging.position
            FROM tb_music
            INNER JOIN tb_belonging ON tb_music.id = tb_belonging.music_id
            WHERE tb_belonging.playlist_id = :playlistId
            ORDER BY tb_belonging.position
                """)
    List<MusicMinProjection> searchByPlaylist(Long playlistId);
}
