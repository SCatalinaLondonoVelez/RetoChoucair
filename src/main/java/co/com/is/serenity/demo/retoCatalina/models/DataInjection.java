package co.com.is.serenity.demo.retoCatalina.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es", "CO"));

    private final String productName;
    private final String image;
    private final String supplier;
    private final String category;
    private final String quantityPerUnit;
    private final String unitPrice;
    private final String unitsInStock;
    private final String unitsOnOrder;
    private final String reorderLevel;

    public DataInjection(){
        this.productName =  faker.commerce().productName();
        this.image = "C:\\Users\\Usuario\\IdeaProjects\\co.com.choucair.certification.reto (1)\\co.com.choucair.certification.reto\\Producto.jpeg";
        this.supplier = "Bigfoot Breweries";
        this.category = "Beverages";
        this.quantityPerUnit = "20 kg pkg.";
        this.unitPrice = "35";
        this.unitsInStock = "3";
        this.unitsOnOrder = "4";
        this.reorderLevel = "5";
    }

    public String getProductName() {
        return productName;
    }

    public String getImage() {
        return image;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getCategory() {
        return category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public String getUnitsInStock() {
        return unitsInStock;
    }

    public String getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public String getReorderLevel() {
        return reorderLevel;
    }
}
