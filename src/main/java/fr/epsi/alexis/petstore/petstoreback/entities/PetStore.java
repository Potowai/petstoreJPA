package fr.epsi.alexis.petstore.petstoreback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PetStore implements Serializable{
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    @ManyToMany
    private List<Product> products;

    @OneToOne(mappedBy = "petStore")
    @JoinColumn(name = "adress_id", foreignKey = @ForeignKey(name = "FK_petstore_adress"))
    private Adress adress;

}
