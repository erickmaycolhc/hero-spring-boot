package com.inject.hero.api.hero.repositories;

import com.inject.hero.api.hero.entity.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<HeroEntity, Integer> {

    @Query(value = "SELECT * FROM HEROES", nativeQuery = true)
    List<HeroEntity> listHeroes();

}
