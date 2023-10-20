package seminars.first.Shop;

import java.util.Collections;
import java.util.List;

public class Shop {
	private List<Product> products;

	// Геттеры, сеттеры:
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	// Метод должен вернуть отсортированный по возрастанию по цене список продуктов
	public List<Product> sortProductsByPrice() {
		// Допишите реализацию метода самостоятельно
		Collections.sort(products, new ProductComparator());
		return products;
	}

	// Метод должен вернуть самый дорогой продукт
	public Product getMostExpensiveProduct() {
		// Допишите реализацию метода самостоятельно
		Product mostExpProd = this.products.get(0);
		for (Product product : products) {
			if (product.getCost() > mostExpProd.getCost()) {
				mostExpProd = product;
			}
		}
		return mostExpProd;
	}

}

class ProductComparator implements java.util.Comparator<Product> {
	@Override
	public int compare(Product a, Product b) {
		return a.getCost() - b.getCost();
	}
}