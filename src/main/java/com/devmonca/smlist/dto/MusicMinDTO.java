package com.devmonca.smlist.dto;

import com.devmonca.smlist.entities.Music;
import com.devmonca.smlist.projection.MusicMinProjection;
import lombok.Getter;
import lombok.Setter;

@Getter

public class MusicMinDTO {
    private Long id;
    private String title;
    private String artist;
    private String genre;

    public MusicMinDTO(){

    }

    public MusicMinDTO(Music entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.artist=entity.getArtist();
        this.genre=entity.getGenre();
    }

    public MusicMinDTO(MusicMinProjection projection){
        this.id= projection.getId();
        this.title= projection.getTitle();
        this.artist= projection.getArtist();
        this.genre= projection.getGenre();
    }
}
