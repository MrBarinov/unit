package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {

	/*
	 * 1. Напишите тесты, чтобы проверить, что магазин хранит верный список
	 * продуктов (правильное количество продуктов, верное содержимое корзины).
	 * 2. Напишите тесты для проверки корректности работы метода
	 * getMostExpensiveProduct.
	 * 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice
	 * (проверьте правильность сортировки).
	 */
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		Product prod1 = new Product();
		prod1.setCost(500);
		prod1.setTitle("Bag");
		Product prod2 = new Product();
		prod2.setCost(100);
		prod2.setTitle("Cola");
		Product prod3 = new Product();
		prod3.setCost(1000);
		prod3.setTitle("Jeans");
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);

		Shop shop = new Shop();
		shop.setProducts(products);

		assertThat(shop.getProducts().size()).isEqualTo(3);
		List<Product> rightSortProducts = new ArrayList<Product>();
		rightSortProducts.add(prod2);
		rightSortProducts.add(prod1);
		rightSortProducts.add(prod3);
		assertThat(shop.sortProductsByPrice()).isEqualTo(rightSortProducts);
		assertThat(shop.getMostExpensiveProduct()).isEqualTo(prod3);
	}
}