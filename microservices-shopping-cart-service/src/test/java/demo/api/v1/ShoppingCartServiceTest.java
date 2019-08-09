/*package demo.api.v1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.shopping.web.ShoppingCartApplication;
import com.shopping.web.cart.CartEvent;
import com.shopping.web.cart.CartEventType;
import com.shopping.web.cart.ShoppingCart;
import com.shopping.web.catalog.Catalog;
import com.shopping.web.controller.ShoppingCartServiceV1;
import com.shopping.web.product.Product;
import com.shopping.web.user.User;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShoppingCartApplication.class)
@ActiveProfiles(profiles = "test")
@WebIntegrationTest
public class ShoppingCartServiceTest {

    @Autowired
    private ShoppingCartServiceV1 shoppingCartService;

    @Test
    public void testGetShoppingCart() throws Exception {
        User user = new User(0L);
        shoppingCartService.addCartEvent(new CartEvent(CartEventType.ADD_ITEM, 0L, "SKU-24642", 1), user);
        shoppingCartService.addCartEvent(new CartEvent(CartEventType.ADD_ITEM, 0L, "SKU-24642", 1), user);
        shoppingCartService.addCartEvent(new CartEvent(CartEventType.ADD_ITEM, 0L, "SKU-34563", 1), user);
        shoppingCartService.addCartEvent(new CartEvent(CartEventType.ADD_ITEM, 0L, "SKU-12464", 1), user);
        shoppingCartService.addCartEvent(new CartEvent(CartEventType.ADD_ITEM, 0L, "SKU-64233", 1), user);

        Catalog catalog = new Catalog();
        Set<Product> products = Arrays.asList(
                new Product("Best. Cloud. Ever. (T-Shirt, Men's Large)", "SKU-24642", "it's a shirt", 21.99),
                new Product("Like a BOSH (T-Shirt, Women's Medium)", "SKU-34563", "it's a shirt", 14.99),
                new Product("We're gonna need a bigger VM (T-Shirt, Women's Small)", "SKU-12464", "it's a shirt", 13.99),
                new Product("cf push awesome (Hoodie, Men's Medium)", "SKU-64233", "it's a hoodie", 21.99))
                .stream().collect(Collectors.toSet());
        catalog.setProducts(products);

        ShoppingCart shoppingCart = shoppingCartService.aggregateCartEvents(new User(0L), catalog);
        Assert.notNull(shoppingCart);
        Assert.notEmpty(shoppingCart.getLineItems());
    }
}*/