package hipshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hipshop.models.Album;
import hipshop.models.Clothing;
import hipshop.models.Product;
import hipshop.repositories.AlbumRepository;
import hipshop.repositories.ClothingRepository;
import hipshop.repositories.ProductRepository;
import hipshop.repositories.ServiceRepository;
import hipshop.repositories.VendorRepository;

@SpringBootApplication
public class HipSHopApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HipSHopApplication.class, args);
	}
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting...");
		
		Album album1 = new Album("First name album", (float) 1.1);
		
		Clothing clothe1 = new Clothing("First name Cloth", (float) 1.1);
		
		Product product1 = new Product(album1);
		Product product2 = new Product(clothe1);
		productRepository.save(product1);
		productRepository.save(product2);
	}

}
