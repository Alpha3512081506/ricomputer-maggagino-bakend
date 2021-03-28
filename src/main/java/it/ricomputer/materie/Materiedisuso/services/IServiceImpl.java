package it.ricomputer.materie.Materiedisuso.services;

import it.ricomputer.materie.Materiedisuso.entities.Categorie;
import it.ricomputer.materie.Materiedisuso.entities.Location;
import it.ricomputer.materie.Materiedisuso.entities.Product;
import it.ricomputer.materie.Materiedisuso.repositories.CategoryRepository;
import it.ricomputer.materie.Materiedisuso.repositories.LocationRepository;
import it.ricomputer.materie.Materiedisuso.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
@Service
@Transactional
public class IServiceImpl implements IService
{
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    private LocationRepository locationRepository;

    public IServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository, LocationRepository locationRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.locationRepository = locationRepository;
    }
    @Override
    public void iniCategories() {
        Stream.of("CAVI","BATTERIE","SSD","PORTATILI","COMPUTER","SCREEN","HDD")
                .forEach(cat->{
                    Categorie category = new Categorie();
                    category.setCategoryName(cat);
                    for (int i = 0; i < category.getCategoryName().length(); i++) {
                        category.setId("CAT"+i);
                    }
                    this.categoryRepository.save(category);
                });
    }

    @Override
    public void iniLocation() {
      Stream.of("SCAFALLO A","SCAFALLO B","SCAFALLO C","SCAFALLO D","SCAFALLO E","SCAFALLO F","SCAFALLO F")
              .forEach(sc->{
                  Location location =new Location();

                    location.setId("SCF");

                  location.setLocationName(sc);
                  locationRepository.save(location);
              });
    }

    @Override
    public void iniProducts() {

        List<Categorie> categories = categoryRepository.findAll();
        List<Location> locations = locationRepository.findAll();
            categories.forEach(c->{
                 for (int i = 1; i < 10; i++) {
                     Product product = new Product();
                     product.setId("PDT"+i);
                     product.setProdcutName("product"+i);
                     product.setNote("buon proddotto ");
                     product.setCustomField1("un test personnalisato 1 ");
                     product.setCustomField2("test personnalisato 2");
                     product.setCreatedAt(new Date());
                     product.setUpdatedAt(new Date());
                     product.setAlertQuantity(5+(int)(Math.random()*10));
                     product.setCurrentQuantity(10+(int)(Math.random()*15));
                     product.setCategory(c);
                     product.setLocation(locations.get(new Random().nextInt(locations.size())));

                     this.productRepository.save(product);
                 }


            });

        ;

    }
}
