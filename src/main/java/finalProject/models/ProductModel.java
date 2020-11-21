package finalProject.models;


import org.openqa.selenium.By;

public class ProductModel {

    private String productName = "Apple Watch Series 6 GPS 40mm Space Gray Aluminum Black Sport Band";
    private By productPrice = By.xpath("//div[@class='product-price-details__block']");


    public String getProductName() {
        return productName;
    }

    public By getProductPrice() {
        return productPrice;
    }
}
