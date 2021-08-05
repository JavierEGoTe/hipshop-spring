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
import hipshop.models.Member;
import hipshop.models.Vendor;
import hipshop.repositories.AlbumRepository;
import hipshop.repositories.ClothingRepository;
import hipshop.repositories.ProductRepository;
import hipshop.repositories.PurchaseOrderRepository;
import hipshop.repositories.ServiceRepository;
import hipshop.repositories.SongRepository;
import hipshop.repositories.MemberRepository;
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
	private MemberRepository userRepository;
	@Autowired
	private CardRepository cardRepository;
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	@Autowired
	private PurchaseOrderItemRepository purchaseOrderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting...");
		
		
		Clothing clothe1 = new Clothing("First name Cloth",precio);
		
		Service service1 = new Service("First name service", precio);
		
		Song song1 = new Song("Song 1", album1);
		Song song2 = new Song("Song 2", album1);
		Song song3 = new Song("Song 3", album1);
		
		
		Vendor vendor1 = new Vendor("First Vendor");
		Vendor vendor2 = new Vendor("second Vendor");
		
		vendorRepository.save(vendor1);
		vendorRepository.save(vendor2);
		
		Product product1 = new Product(album1, vendor1);
		Product product2 = new Product(clothe1, vendor2);
		Product product3 = new Product(service1, vendor1);
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		
		songRepository.save(song1);
		songRepository.save(song2);
		songRepository.save(song3);
		
		
		
		Member user1 = new Member("first user name");
		Member user2 = new Member("first user name");
		
		userRepository.save(user1);
		userRepository.save(user2);
		
		Card card1 = new Card(user1, "first user card");
		Card card2 = new Card(user2, "second user card");
		
		cardRepository.save(card1);
		cardRepository.save(card2);
		
		PurchaseOrder purchase1 = new PurchaseOrder(10f, user1);
		
		PurchaseOrderItem item1 = new PurchaseOrderItem(purchase1, product1, precio);
		PurchaseOrderItem item2 = new PurchaseOrderItem(purchase1, product2, precio);
		
		purchaseOrderRepository.save(purchase1);
		purchaseOrderItemRepository.save(item1);
		purchaseOrderItemRepository.save(item2);
		
	}

}
