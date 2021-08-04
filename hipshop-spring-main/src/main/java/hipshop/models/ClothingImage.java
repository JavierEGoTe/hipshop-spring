package hipshop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClothingImage {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
	@SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(nullable = false)
	private String productName;
	
	@ManyToOne
	@Column(nullable = false)
	private Integer clothingId;
	
	
	public ClothingImage() {
	}

	public ClothingImage(String productName, Integer clothingId) {
		this.productName = productName;
		this.clothingId = clothingId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getClothingId() {
		return clothingId;
	}
	public void setClothingId(Integer clothingId) {
		this.clothingId = clothingId;
	}
	
	
	
}
