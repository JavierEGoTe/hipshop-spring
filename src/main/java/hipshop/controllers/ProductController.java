package hipshop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hipshop.models.Product;
import hipshop.models.PurchaseOrder;
import hipshop.models.Member;
import hipshop.models.Vendor;
import hipshop.models.Album;
import hipshop.repositories.AlbumRepository;
import hipshop.repositories.ProductRepository;
import hipshop.repositories.MemberRepository;
import hipshop.repositories.VendorRepository;
import hipshop.repositories.PurchaseOrderRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	AlbumRepository albumRepository;
	@Autowired
	VendorRepository vendorRepository;
	@Autowired
	MemberRepository userRepository;
	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	
	
	
	@GetMapping
	public ArrayList<Product> getProducts(){
		ArrayList<Product> products = (ArrayList<Product>) productRepository.findAll();
		return products;
	}
	
	@GetMapping("/vendor")
	public ArrayList<Vendor> getVendors(){
		System.out.println("Getting vendors ");
		return (ArrayList<Vendor>) vendorRepository.findAll();
	}
	
	@GetMapping("/users")
	public ArrayList<Member> getUsers(){
		System.out.println("Getting Users ");
		return (ArrayList<Member>) userRepository.findAll();
	}
	
	@GetMapping("/orders")
	public ArrayList<PurchaseOrder> getOrders(){
		return (ArrayList<PurchaseOrder>) purchaseOrderRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Album> getAlbum(@PathVariable Long id){
		System.out.println("The id is: "+id);
		return albumRepository.findById(id);
	}
}
