package fr.epsi.alexis.petstore.petstoreback.controllers;

import fr.epsi.alexis.petstore.petstoreback.entities.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}