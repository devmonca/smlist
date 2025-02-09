package com.devmonca.smlist.dto;

import com.devmonca.smlist.entities.Playlist;
import lombok.Getter;

@Getter

public class PlaylistDTO {
    private Long id;
    private String title;

    public PlaylistDTO(){

    }

    public PlaylistDTO(Playlist entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
    }
}
