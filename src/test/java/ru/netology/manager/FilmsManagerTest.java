package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.FilmsManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {

    FilmsManager poster = new FilmsManager();
    FilmsManager poster1 = new FilmsManager(5);

    @Test
    void film() {
        poster.add("Matrix");
        poster.add("1941");
        poster.add("Bladshot");
        poster.add("Rambo");
        poster.add("FastFurious");
        poster.add("Commando");
        poster.add("StarWars");
        poster.add("HarryPotter");
        poster.add("PiratesCaribbean");
        poster.add("ForrestGamp");
        poster.add("Avengers Не попал в массив");
        poster.findAll();
        poster1.add("FasrFurious");
        poster1.add("Commando");
        poster1.add("StarWars");
        poster1.findLast();
        poster.findAll();
        poster1.findAll();
    }

}
