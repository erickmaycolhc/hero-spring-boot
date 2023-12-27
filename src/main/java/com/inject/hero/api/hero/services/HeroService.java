package com.inject.hero.api.hero.services;


import com.inject.hero.api.hero.dto.HeroDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HeroService {
    List<HeroDto> listHeroes();
}
