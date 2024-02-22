package fr.epsi.alexis.petstore.petstoreback.entities;

import fr.epsi.alexis.petstore.petstoreback.enums.FishLivEnv;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Fish extends Animal implements Serializable {
    private FishLivEnv livingEnv;
}
