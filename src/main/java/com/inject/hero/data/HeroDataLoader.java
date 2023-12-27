package com.inject.hero.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inject.hero.api.hero.entity.HeroEntity;
import com.inject.hero.api.hero.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

@Component
public class HeroDataLoader implements ApplicationRunner {
    @Autowired
    HeroRepository heroRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*Path file = ResourceUtils.getFile("classpath:data/heroes.json").toPath();
        String fileContent = new String(Files.readAllBytes(file));

        ObjectMapper objectMapper = new ObjectMapper();
        List<HeroEntity> heroes = Arrays.asList(objectMapper.readValue(fileContent, HeroEntity[].class));
        heroRepository.saveAll(heroes);*/

        ObjectMapper objectMapper = new ObjectMapper();
        // Cargar el archivo desde el classpath
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/heroes.json");
        System.out.println("inputStream => " + inputStream.toString());

        if (inputStream != null) {
            List<HeroEntity> heroes = Arrays.asList(objectMapper.readValue(inputStream, HeroEntity[].class));
            heroRepository.saveAll(heroes);
        } else {
            System.err.println("No se pudo cargar el archivo heroes.json");
        }



        /*List<HeroEntity> Hero = Arrays.asList(
                HeroEntity
                        .builder()
                        .id(1)
                        .superhero("loki")
                        .publisher("malo")
                        .alter_ego("2015")
                        .first_appearance("hulk, iron man")
                        .characters("DC - Comics")
                        .alt_img("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/b/b6/Loki_-_Perfil.png/revision/latest?cb=20211002031514&path-prefix=es")
                        .build()
        );
        heroRepository.saveAll(Hero);*/
    }
}

