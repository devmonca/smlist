package com.devmonca.smlist.repositories;

import com.devmonca.smlist.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
