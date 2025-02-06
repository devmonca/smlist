package com.devmonca.smlist.controllers;

import com.devmonca.smlist.dto.MusicMinDTO;
import com.devmonca.smlist.entities.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devmonca.smlist.repositories.MusicRepository;
import com.devmonca.smlist.services.MusicService;

import java.util.List;

@RestController
@RequestMapping(value = "/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping()
    public List<MusicMinDTO> findAll(){
        List<MusicMinDTO> response = musicService.findAll();
        return response;
    }
}
