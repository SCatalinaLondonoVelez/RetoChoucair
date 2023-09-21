package co.com.is.serenity.demo.retoCatalina.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewProductUI {
    public static final Target BTN_NORTHWIND = Target.the("BTN_NORTHWIND").locatedBy("//span[contains(text(),'Northwind')]");
    public static final Target BTN_PRODUCTS = Target.the("BTN_PRODUCTS").locatedBy("//span[contains(text(),'Products')]");
    public static final Target BTN_NEW_PRODUCT = Target.the("BTN_NEW_PRODUCT").locatedBy("//span[contains(text(),'New Product')]");
    public static final Target INP_PRODUCT_NAME = Target.the("INP_PRODUCT_NAME").located(By.name("ProductName"));
    public static final Target INP_PRODUCT_IMAGE = Target.the("INP_PRODUCT_IMAGE").locatedBy("//input[contains(@name, 'Serenity_ImageUploadEditor')]");
    public static final Target IMAGE = Target.the("INP_PRODUCT_IMAGE").locatedBy("//li/a[@class='thumb cboxElement']");
    public static final Target CHK_DISCONTINUED = Target.the("CHK_DISCONTINUED").located(By.id("Serenity_Demo_Northwind_ProductDialog9_Discontinued"));
    public static final Target LIST_SUPPLIER = Target.the("LIST_SUPPLIER").locatedBy("//div[@class='field SupplierID']/div/a");
    public static final Target INP_SUPPLIER = Target.the("INP_SUPPLIER").locatedBy("/html/body/div[7]/div/input");
    public static final Target LIST_CATEGORY = Target.the("LIST_CATEGORY").locatedBy("//div[@class='field CategoryID']/div/a");
    public static final Target INP_CATEGORY = Target.the("INP_CATEGORY").locatedBy("/html/body/div[8]/div/input");
    public static final Target INP_QUANTITY_PER_UNIT = Target.the("INP_QUANTITY_PER_UNIT").located(By.name("QuantityPerUnit"));
    public static final Target INP_UNIT_PRICE = Target.the("INP_UNIT_PRICE").located(By.name("UnitPrice"));
    public static final Target INP_UNIT_IN_STOCK = Target.the("INP_UNIT_IN_STOCK").located(By.name("UnitsInStock"));
    public static final Target INP_UNIT_ON_ORDER = Target.the("INP_UNIT_ON_ORDER").located(By.name("UnitsOnOrder"));
    public static final Target INP_REORDER_LEVEL = Target.the("INP_REORDER_LEVEL").located(By.name("ReorderLevel"));

    //public static final Target BTN_SAVE = Target.the("BTN_SAVE").locatedBy("//*[@id=\"Serenity_Demo_Northwind_ProductDialog9_Toolbar\"]/div/div/div/div[1]");
    public static final Target BTN_SAVE = Target.the("BTN_SAVE").locatedBy("//i[@class='fa fa-check-circle text-purple']");


    //search product
    public static final Target LIST_FILTER_DISCONTINUED = Target.the("CHK_DISCONTINUED").locatedBy("//div[1][@class='quick-filter-item']/div/a");
    public static final Target INP_FILTER_DISCONTINUED = Target.the("INP_UNIT_IN_STOCK").located(By.id("s2id_autogen1_search"));
    public static final Target LIST_FILTER_SUPPLIER = Target.the("CHK_DISCONTINUED").locatedBy("//div[2][@class='quick-filter-item']/div/a");
    public static final Target INP_FILTER_SUPPLIER = Target.the("CHK_DISCONTINUED").locatedBy("//input[@id='s2id_autogen2_search']");
    public static final Target LIST_FILTER_CATEGORY = Target.the("CHK_DISCONTINUED").located(By.id("s2id_autogen3"));
    public static final Target VALIDATED_PRODUCT_NAME = Target.the("CHK_DISCONTINUED").locatedBy("//a[contains(text(),'Incredible Concrete Gloves')]");

}
