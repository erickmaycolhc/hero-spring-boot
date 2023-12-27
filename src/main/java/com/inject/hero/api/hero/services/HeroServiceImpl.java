package com.inject.hero.api.hero.services;

import com.inject.hero.api.hero.dto.HeroDto;
import com.inject.hero.api.hero.entity.HeroEntity;
import com.inject.hero.api.hero.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService{
    @Autowired
    HeroRepository heroRepository;

    @Override
    public List<HeroDto> listHeroes() {
        List<HeroEntity> heroEntities = heroRepository.listHeroes();

        return heroEntities.stream().map(entity ->
             entityToDto(entity)
        ).toList();
    }

    private HeroDto entityToDto(HeroEntity heroEntity){
        if(heroEntity == null) return null;

        return HeroDto
                .builder()
                .id(heroEntity.getId())
                .superhero(heroEntity.getSuperhero())
                .publisher(heroEntity.getPublisher())
                .alter_ego(heroEntity.getAlter_ego())
                .first_appearance(heroEntity.getFirst_appearance())
                .characters(heroEntity.getCharacters())
                .alt_img(heroEntity.getAlt_img())
                .build();
    }


}

