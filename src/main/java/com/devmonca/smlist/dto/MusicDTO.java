package com.devmonca.smlist.dto;

import com.devmonca.smlist.entities.Music;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter

public class MusicDTO {
    private Long id;
    private String title;
    private Integer year;
    private String artist;
    private String imgUrl;
    private String genre;

    public MusicDTO(Music entity){
        BeanUtils.copyProperties(entity, this);
    }
}
