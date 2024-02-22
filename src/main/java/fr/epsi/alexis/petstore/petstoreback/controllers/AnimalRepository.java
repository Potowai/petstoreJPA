package fr.epsi.alexis.petstore.petstoreback.controllers;

import fr.epsi.alexis.petstore.petstoreback.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}