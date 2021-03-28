package it.ricomputer.materie.Materiedisuso.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id
    private String id;
    private String categoryName ;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;



}
