package com.devmonca.smlist.repositories;

import com.devmonca.smlist.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE playlist_id = :playlistId AND music_id = :musicId ")
    public void updateBelongingPosition(Long playlistId, Long musicId, Integer newPosition);
}
