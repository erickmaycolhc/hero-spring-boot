package com.inject.hero.api.hero.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Heroes")
public class HeroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String superhero;
    private String publisher;
    private String alter_ego;
    private String first_appearance;
    private String characters;
    private String alt_img;

}
