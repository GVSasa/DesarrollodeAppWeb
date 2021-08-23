
package mx.tec.web.lab.manager;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.web.lab.entity.Product;
import mx.tec.web.lab.repository.ProductRepository;
import mx.tec.web.lab.entity.Sku;

/**
 * Access to available business operations for products
 * @author 
 *
 */
@Service
public class ProductManager {
 
	@Resource
	ProductRepository productRepository;
	
//    
	/**
	 * Retrieves all products on the Data Base
	 * @return
	 */
	
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
//
    /**
     * Returns a specific product
     * @param id
     * @return
     */
    public Optional<Product> getProduct(final long id) {
        return productRepository.findById(id);
    }
    /**
     * Adds new product to the queue
     * @param newProduct
     * @return
     */

    public Product addProduct(final Product newProduct) {
    	
    	for (final Sku newSku : newProduct.getChildSkus()) {
    		newSku.setParentProduct(newProduct);
    	}
    	
        return productRepository.save(newProduct);
    }
    /**
     * Deletes a specific product
     * @param existingProduct
     */
    
    public void deleteProduct(final Product existingProduct) {
		productRepository.delete(existingProduct);
	}
    
    /**
     * Updates information from a specific product
     * @param id
     * @param modifiedProduct
     */
    
    public void updateProduct(final long id, final Product modifiedProduct) {
		if (modifiedProduct.getId() == id) {
			for (final Sku modifiedSku : modifiedProduct.getChildSkus()) {
				modifiedSku.setParentProduct(modifiedProduct);
			}			
			
			productRepository.save(modifiedProduct);
		}
	}

    /**
	 * Retrieve an specific product based on a given product id
	 * @param pattern Pattern to search
	 * @return Optional containing a product if the product was found or empty otherwise
	 */
	public List<mx.tec.web.lab.entity.Product> getProducts(final String pattern) {
		return productRepository.findByNameLike(pattern);
	}

    
    
}


