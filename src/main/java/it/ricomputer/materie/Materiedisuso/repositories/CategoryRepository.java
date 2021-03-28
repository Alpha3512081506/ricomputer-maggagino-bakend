package it.ricomputer.materie.Materiedisuso.repositories;

import it.ricomputer.materie.Materiedisuso.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Categorie,String> {
}
