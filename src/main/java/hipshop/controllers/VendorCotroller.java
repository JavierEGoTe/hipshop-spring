package hipshop.controllers;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hipshop.models.Vendor;
import hipshop.services.VendorService;


@RestController
@RequestMapping("/vendor")
public class VendorCotroller {
	
	@Autowired
	VendorService vendorService;
	
	@GetMapping
	public ArrayList<Vendor> getUsers(){
		return vendorService.getVendors();
	}
	@PostMapping
	public Vendor saveVendor(@RequestBody Vendor vendor) {
			return vendorService.saveVendor(vendor);
	}
	@GetMapping(path = "/{idVendor}")
	public Optional<Vendor> getUserById(@PathVariable("idVendor") Long idVariable){
		return vendorService.getUserById(idVariable);
	}
	@DeleteMapping(path = "/{idVendor}")
	public String deleteVendor(@PathVariable("idVendor")Long id) {
		boolean ok = vendorService.deleteVendor(id);
		if(ok) {
			return "Se eliminó vendedor";
		}else {
			return "No se pudo eliminar el vendedor";
		}
	}
	
	@GetMapping("/query")
	public ArrayList<Vendor> getUsersByName(@RequestParam(value = "name", defaultValue="")String name){
		return vendorService.getfindByName(name); 
	}
	

}
