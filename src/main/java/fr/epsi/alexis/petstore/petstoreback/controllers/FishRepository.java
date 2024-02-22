package fr.epsi.alexis.petstore.petstoreback.controllers;

import fr.epsi.alexis.petstore.petstoreback.entities.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {
}