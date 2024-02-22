package fr.epsi.alexis.petstore.petstoreback.controllers;

import fr.epsi.alexis.petstore.petstoreback.entities.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}