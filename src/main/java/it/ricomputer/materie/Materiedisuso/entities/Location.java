package it.ricomputer.materie.Materiedisuso.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    private String id;
    private  String locationName;
    @OneToMany(mappedBy = "location")
    private Collection<Product> products;

}
