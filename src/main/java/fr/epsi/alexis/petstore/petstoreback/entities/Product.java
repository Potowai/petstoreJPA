package fr.epsi.alexis.petstore.petstoreback.entities;

import fr.epsi.alexis.petstore.petstoreback.enums.ProdType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long Id;
    private String code;
    private String label;
    @Enumerated
    private ProdType type;
    private double price;
    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores = new ArrayList<>();
}
