package com.devmonca.smlist.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReplacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;

    public ReplacementDTO(){

    }

    public ReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }
}
