package com.devmonca.smlist.services;

import com.devmonca.smlist.dto.PlaylistDTO;
import com.devmonca.smlist.entities.Playlist;
import com.devmonca.smlist.repositories.MusicRepository;
import com.devmonca.smlist.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;
    @Autowired
    private MusicRepository musicRepository;

    @Transactional(readOnly = true)
    public List<PlaylistDTO> findAll(){
        List<Playlist> response = playlistRepository.findAll();
        return response.stream().map(x -> new PlaylistDTO(x)).toList();
    }

}
