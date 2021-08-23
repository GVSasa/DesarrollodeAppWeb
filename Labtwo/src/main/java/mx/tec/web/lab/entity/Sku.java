package mx.tec.web.lab.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * The class of Skus
 * @author sebas
 * 
 */



@Entity
public class Sku implements Serializable {
	
	
	
	/**
	 * Generated Id
	 */
	private static final long serialVersionUID = 4249537587118852246L;
	@Id
	@GeneratedValue
	
	/**
	 * id of the Sku
	 */
	private	long id;
	/**
	 * color of the Sku
	 */
	private	String color;
	/**
	 * size of the Sku
	 */
	private	String size;
	/**
	 * listPrice of the Sku
	 */
	private	double listPrice;
	/**
	 * salePrice of the Sku
	 */
	private	double salePrice;
	/**
	 * quantityOnHand of the Sku
	 */
	private	long quantityOnHand;
	/**
	 * Url small image of the Sku
	 */
	private String smallImageUrl;
	/**
	 * Url medium image of the Sku
	 */
	private String mediumImageUrl;
	/**
	 * Url large image of the Sku
	 */
	private String largeImageUrl;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Product parentProduct;
	
	


	public Sku(long id, String color, String size, double listPrice, double salePrice, long quantityOnHand, String smallImageUrl, String mediumImageUrl, String largeImageUrl) {
		super();
		this.id = id;
		this.color = color;
		this.size = size;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantityOnHand = quantityOnHand;
		this.smallImageUrl = smallImageUrl;
		this.mediumImageUrl = mediumImageUrl;
		this.largeImageUrl = largeImageUrl;
		
	}
	
	/**
	 * Method toString
	 */
	
@Override
	public String toString() {
		return "Sku [id=" + id + ", color=" + color + ", size=" + size + ", listPrice=" + listPrice + ", salePrice="
				+ salePrice + ", quantityOnHand=" + quantityOnHand + ", smallImageUrl=" + smallImageUrl
				+ ", mediumImageUrl=" + mediumImageUrl + ", largeImageUrl=" + largeImageUrl + ", parentProduct="
				+ parentProduct + "]";
	}



/**
	 * @return the parentProduct
	 */
	public Product getParentProduct() {
		return parentProduct;
	}


	/**
	 * @param parentProduct the parentProduct to set
	 */
	public void setParentProduct(Product parentProduct) {
		this.parentProduct = parentProduct;
	}
	/**
	 * Constructor without arguments
	 */
	public Sku() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * if getter
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * id setter
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * color getter
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * color setter
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * size getter
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * size setter
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * listPrice getter
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	/**
	 * listPrice setter
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	/**
	 * salePrice getter
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}
	/**
	 * salePrice setter
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @return the quantityOnHand
	 */
	public long getQuantityOnHand() {
		return quantityOnHand;
	}
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	

	/**
	 * @return the smallImageUrl
	 */
	public String getsmallImageUrl() {
		return smallImageUrl;
	}
	/**
	 * @param smallImageUrl the smallImageUrl to set
	 */
	public void setsmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	/**
	 * @return the mediumImageUrl
	 */
	public String getmediumImageUrl() {
		return mediumImageUrl;
	}
	/**
	 * @param mediumImageUrl the mediumImageUrl to set
	 */
	public void setmediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	/**
	 * @return the largeImageUrl
	 */
	public String getlargeImageUrl() {
		return largeImageUrl;
	}
	/**
	 * @param largeImageUrl the largeImageUrl to set
	 */
	public void setlargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}

	/**
	 * hashCode of Sku
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((largeImageUrl == null) ? 0 : largeImageUrl.hashCode());
		long temp;
		temp = Double.doubleToLongBits(listPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mediumImageUrl == null) ? 0 : mediumImageUrl.hashCode());
		result = prime * result + ((parentProduct == null) ? 0 : parentProduct.hashCode());
		result = prime * result + (int) (quantityOnHand ^ (quantityOnHand >>> 32));
		temp = Double.doubleToLongBits(salePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((smallImageUrl == null) ? 0 : smallImageUrl.hashCode());
		return result;
	}

	/**
	 * equals of Sku
	 */
	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sku)) {
            return false;
        }
        Sku other = (Sku) obj;
        return id == other.id;
    }
	
	
	
	
}
