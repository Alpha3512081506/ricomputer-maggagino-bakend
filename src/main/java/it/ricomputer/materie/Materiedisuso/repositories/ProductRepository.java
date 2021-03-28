package it.ricomputer.materie.Materiedisuso.repositories;

import it.ricomputer.materie.Materiedisuso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, String> {
}
