import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Add {

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;


    @Test
    public void search_a_product(){
        homePage.searchBox().search("Pantolan");
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on products page!");


    }

    @Test
    public void select_product(){
        productPage.selectProduct(1);
        Assertions.assertTrue(productPage.isOnProductDetailPage(),
                "Not on product detail page");


    }

    @Test
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase");


    }

    @Test
    public void go_to_cart(){
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart");

    }

}
