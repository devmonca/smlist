package com.devmonca.smlist.projection;

public interface MusicMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getArtist();
    String getImgUrl();
    String getGenre();
    Integer getPosition();
}
