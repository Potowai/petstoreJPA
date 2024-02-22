package fr.epsi.alexis.petstore.petstoreback.controllers;

import fr.epsi.alexis.petstore.petstoreback.entities.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}