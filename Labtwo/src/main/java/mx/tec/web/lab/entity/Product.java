package mx.tec.web.lab.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Product class 
 * @author sebas
 *
 */


@Entity
public class Product implements Serializable {
	
	
	/**
	 * Generated Id
	 */
	private static final long serialVersionUID = 666090158503115453L;
	@Id
	@GeneratedValue
	/**
	 * id of Product
	 */
	private long id;
	/**
	 * name of Product
	 */
	private String name;
	/**
	 * description of Product
	 */
	private String desription;
	@OneToMany(mappedBy = "parentProduct", cascade = CascadeType.ALL)
	/**
	 * childSkus of Product
	 */
	private List<Sku> childSkus;
	
	
	/**
	 * Constructor without arguments 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(long id, String name, String desription, List<Sku> childSkus) {
		super();
		this.id = id;
		this.name = name;
		this.desription = desription;
		this.childSkus = childSkus;
	}
	
	/**
	 * Method toString 
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desription=" + desription + ", childSkus=" + childSkus + "]";
	}
	
	/**
	 * id getter
	 * @return
	 */
	
	public long getId() {
		return id;
	}
	/**
	 * id setter
	 * @return
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	
	/**
	 * name getter
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * name setter
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * description getter
	 * @return the desription
	 */
	public String getDesription() {
		return desription;
	}
	/**
	 * description setter
	 * @param desription the desription to set
	 */
	public void setDesription(String desription) {
		this.desription = desription;
	}
	/**
	 * childSkus getter
	 * @return the childSkus
	 */
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	/**
	 * childSkus setter
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	}

	
	/**
	 * hashcode of Product
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childSkus == null) ? 0 : childSkus.hashCode());
		result = prime * result + ((desription == null) ? 0 : desription.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * equals of Product
	 */

	@Override
	
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return id == other.id;
    }
}
