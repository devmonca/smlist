package com.devmonca.smlist.dto;

import com.devmonca.smlist.entities.Music;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MusicMinDTO {
    private Long id;
    private String title;
    private String artist;
    private String genre;

    public MusicMinDTO(Music entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.artist=entity.getArtist();
        this.genre=entity.getGenre();
    }
}
