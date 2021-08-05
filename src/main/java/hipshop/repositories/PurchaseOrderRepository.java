package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import hipshop.models.PurchaseOrder;
import hipshop.models.User;
import hipshop.models.Vendor;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {

	public abstract ArrayList<PurchaseOrder> findByName(User user);
}
