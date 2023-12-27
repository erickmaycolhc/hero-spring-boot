package com.inject.hero.api.hero.controllers;

import com.inject.hero.api.hero.dto.HeroDto;
import com.inject.hero.api.hero.dto.Response;
import com.inject.hero.api.hero.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/hero/v1")
public class HeroController {

    @Autowired
    HeroService heroService;


    @GetMapping("heroes")
    public Response<List<HeroDto>> listHeroes(){
        List<HeroDto> heroDto = heroService.listHeroes();
        if(heroDto.size() == 0){
            return new Response<List<HeroDto>>().setMessage("No se encontro resultados");
        }
        System.out.println("ssss 22 ==> " + heroDto);
        return new Response<List<HeroDto>>().setData(heroDto).setMessage("Se encontro resultados");




        /*if(heroDto === null){
            return new ResponseEntity<>("", HttpStatus.OK);
        }
        return new ResponseEntity<>(heroService.listHeroes(), HttpStatus.OK);*/

    }
}
