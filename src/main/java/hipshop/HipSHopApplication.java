package hipshop;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hipshop.models.Album;
import hipshop.models.Card;
import hipshop.models.Clothing;
import hipshop.models.Product;
import hipshop.models.PurchaseOrder;
import hipshop.models.PurchaseOrderItem;
import hipshop.models.Service;
import hipshop.models.Song;
import hipshop.models.User;
import hipshop.models.Vendor;
import hipshop.repositories.AlbumRepository;
import hipshop.repositories.ClothingRepository;
import hipshop.repositories.ProductRepository;
import hipshop.repositories.PurchaseOrderRepository;
import hipshop.repositories.ServiceRepository;
import hipshop.repositories.SongRepository;
import hipshop.repositories.UserRepository;
import hipshop.repositories.VendorRepository;
import hipshop.repositories.CardRepository;
import hipshop.repositories.PurchaseOrderItemRepository;

@SpringBootApplication
public class HipSHopApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HipSHopApplication.class, args);
	}
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private SongRepository songRepository;
	@Autowired
	private VendorRepository vendorRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CardRepository cardRepository;
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	@Autowired
	private PurchaseOrderItemRepository purchaseOrderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting...");
		
		
		
	}

}
