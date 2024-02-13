package AmazoneImplementation;

public class Search {
	
	
	
	public String displayProduct(Product product) {
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("new comment");
	}

}
