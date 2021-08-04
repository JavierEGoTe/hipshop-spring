package hipshop.models;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Clothing implements  ProductType{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
	@SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", initialValue = 1, allocationSize = 1)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false,precision = 8, scale = 2)
	private BigDecimal price;
	@Column(nullable = false)
	private String sku;
	@Column(nullable = false)
	private String color;
	@Column(nullable = false)
	private String size;
	@Column(nullable = false)
	private Integer quantity;
	private String gender;
	@Column(nullable = false)
	private float weigth;
	
	@OneToMany(mappedBy="clothingId")
	@JsonManagedReference
	private List<ClothingImage> clothingImages;

	public Clothing() {
	}

	public Clothing(String name, BigDecimal price, String sku, String color, String size, Integer quantity,
			String gender, float weigth, List<ClothingImage> clothingImages) {
		super();
		this.name = name;
		this.price = price;
		this.sku = sku;
		this.color = color;
		this.size = size;
		this.quantity = quantity;
		this.gender = gender;
		this.weigth = weigth;
		this.clothingImages = clothingImages;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

	@Override
	public String getInfoProduct() {
		return "Name: "+this.getName()+" Price: "+this.getPrice();
	}

}
