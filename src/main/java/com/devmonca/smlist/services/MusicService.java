package com.devmonca.smlist.services;

import com.devmonca.smlist.dto.MusicDTO;
import com.devmonca.smlist.dto.MusicMinDTO;
import com.devmonca.smlist.entities.Music;
import com.devmonca.smlist.projection.MusicMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.devmonca.smlist.repositories.MusicRepository;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    @Transactional(readOnly = true)
    public List<MusicMinDTO> findAll(){
        List<Music> response = musicRepository.findAll();
        return response.stream().map(x->new MusicMinDTO(x)).toList();
    }

    @Transactional
    public MusicDTO findById(Long id){
        Music response = musicRepository.findById(id).get();
        return new MusicDTO(response);
    }

    @Transactional(readOnly = true)
    public List<MusicMinDTO> findByPlaylist(Long playlistId){
        List<MusicMinProjection> response = musicRepository.searchByPlaylist(playlistId);
        return response.stream().map(x-> new MusicMinDTO(x)).toList();
    }

}
