package hipshop.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hipshop.models.Vendor;
import hipshop.repositories.VendorRepository;


@Service
public class VendorService {

	@Autowired
	VendorRepository vendorRepository;
	
	public ArrayList<Vendor> getUsers() {
		return (ArrayList<Vendor>) vendorRepository.findAll();
	}
	
	public Vendor saveVendor(Vendor vendor) {
		String firstName = vendor.getFirstName();
		String lastName = vendor.getLastName();
		String email = vendor.getEmail();
		String password = vendor.getPassword();
		Date dateBirth = vendor.getDateBirth();
		String address = vendor.getAddress();
		String aka = vendor.getAka();
		Integer bankAccount = vendor.getBankAccount();
		String bankName = vendor.getBankName();
		Integer phoneNumber = vendor.getPhoneNumber();
		
		
		if(email != null && password != null && aka != null && bankAccount != null && bankName != null) {
			return vendorRepository.save(vendor);
		}
		
		return vendor;
	}
	
	public Optional<Vendor> getUserById(Long id) {
		return vendorRepository.findById(id);
	}
	
	
	public boolean deleteVendor(Long id) {
		
		
		try {
			vendorRepository.deleteById(id); 
			return true;
		}catch(Exception error) { 
			return false;
		}
	}
	public ArrayList<Vendor> getUsersByFirstName(String firstname){
		return vendorRepository.findByFirstName(firstname);
	}
}
