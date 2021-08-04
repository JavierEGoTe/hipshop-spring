package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import hipshop.models.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
	public abstract ArrayList<Vendor> findByName(String firstname);
}
