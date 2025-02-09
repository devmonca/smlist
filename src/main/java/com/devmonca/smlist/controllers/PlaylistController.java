package com.devmonca.smlist.controllers;

import com.devmonca.smlist.dto.MusicMinDTO;
import com.devmonca.smlist.dto.PlaylistDTO;
import com.devmonca.smlist.dto.ReplacementDTO;
import com.devmonca.smlist.entities.Music;
import com.devmonca.smlist.entities.Playlist;
import com.devmonca.smlist.services.MusicService;
import com.devmonca.smlist.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/playlists")
public class PlaylistController {

    @Autowired
    private final PlaylistService playlistService;
    @Autowired
    private MusicService musicService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping
    public List<PlaylistDTO> findAll(){
        List<PlaylistDTO> response = playlistService.findAll();
        return response;
    }

    @GetMapping(value = "/{playlistId}/musics")
    public List<MusicMinDTO> findByPlaylist(@PathVariable Long playlistId){
        List<MusicMinDTO> response = musicService.findByPlaylist(playlistId);
        return response;
    }

    @PostMapping(value = "/{playlistId}/replacement")
    public void moveMusic(@PathVariable Long playlistId, @RequestBody ReplacementDTO body){
        playlistService.move(playlistId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
