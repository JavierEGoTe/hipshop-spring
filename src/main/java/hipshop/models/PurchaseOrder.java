package hipshop.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Float total;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="orderId")
	@JsonManagedReference
	private List<PurchaseOrderItem> purchaseOrderItem;
	
	
	

	public PurchaseOrder() {
	}
	
	

	public PurchaseOrder(Float total, User user) {
		this.total = total;
		this.user = user;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public List<PurchaseOrderItem> getPurchaseOrderItem() {
		return purchaseOrderItem;
	}



	public void setPurchaseOrderItem(List<PurchaseOrderItem> purchaseOrderItem) {
		this.purchaseOrderItem = purchaseOrderItem;
	}


	
}
