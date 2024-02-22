package fr.epsi.alexis.petstore.petstoreback.entities;

import jakarta.persistence.*;
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
public class Adress implements Serializable {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long Id;
    private String number;
    private String street;
    private String zipCode;
    private String city;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "Adress_petStore",
            joinColumns = @JoinColumn(name = "adress_Id"),
            inverseJoinColumns = @JoinColumn(name = "petStore_id"))
    private PetStore petStore;

}
