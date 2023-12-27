package com.inject.hero.api.hero.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeroDto {
    private int id;
    private String superhero;
    private String publisher;
    private String alter_ego;
    private String first_appearance;
    private String characters;
    private String alt_img;
}
