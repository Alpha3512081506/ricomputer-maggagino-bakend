package it.ricomputer.materie.Materiedisuso;

import it.ricomputer.materie.Materiedisuso.entities.Categorie;
import it.ricomputer.materie.Materiedisuso.entities.Location;
import it.ricomputer.materie.Materiedisuso.repositories.CategoryRepository;
import it.ricomputer.materie.Materiedisuso.repositories.LocationRepository;
import it.ricomputer.materie.Materiedisuso.services.IService;
import jdk.jfr.Category;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.stream.Stream;

@SpringBootApplication
public class MateriedisusoApplication  implements  CommandLineRunner{
private IService iService;
private CategoryRepository categoryRepository;
private LocationRepository locationRepository;
	public MateriedisusoApplication(IService iService,CategoryRepository categoryRepository,LocationRepository locationRepository) {
		this.iService= iService;
		this.categoryRepository =categoryRepository;
		this.locationRepository= locationRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MateriedisusoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iService.iniLocation();
		iService.iniCategories();
		iService.iniProducts();
	}
}
