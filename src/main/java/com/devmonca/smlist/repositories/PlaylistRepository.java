package com.devmonca.smlist.repositories;

import com.devmonca.smlist.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
