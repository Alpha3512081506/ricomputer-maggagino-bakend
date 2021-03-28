package it.ricomputer.materie.Materiedisuso.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private  String prodcutName;
    private  Integer currentQuantity;
    private  Integer alertQuantity;
    private String customField1;
    private String customField2;
   // private  String getCustomField2;
    private  String note;
    @Temporal(TemporalType.TIME)
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne
    private Categorie category;
    @ManyToOne
    private Location location;

}
