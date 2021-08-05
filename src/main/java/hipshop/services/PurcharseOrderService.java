package hipshop.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hipshop.models.PurchaseOrder;
import hipshop.models.User;
import hipshop.repositories.PurchaseOrderRepository;


@Service
public class PurcharseOrderService {

	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	
	public ArrayList<PurchaseOrder> getUsers() {
		return (ArrayList<PurchaseOrder>) purchaseOrderRepository.findAll();
	}
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder) {
		Float total = purchaseOrder.getTotal();
		User user = purchaseOrder.getUser();
		String address = purchaseOrder.getAddress();
		String guideNumber = purchaseOrder.getGuideNumber();
		String packageStatus = purchaseOrder.getPackageStatus();
		
		
		if( address != null && guideNumber!= null && packageStatus != null ) {
			return purchaseOrderRepository.save(purchaseOrder);
		}
		
		return purchaseOrder;
	}
	
	public Optional<PurchaseOrder> getUserById(Long id) {
		return purchaseOrderRepository.findById(id);
	}
	
	
	public boolean deletePurchaseOrder(Long id) {
		
		
		try {
			purchaseOrderRepository.deleteById(id); 
			return true;
		}catch(Exception error) { 
			return false;
		}
	}
	public ArrayList<PurchaseOrder> getUsersByUser(User user){
		return purchaseOrderRepository.findByName(user);
	}
}
