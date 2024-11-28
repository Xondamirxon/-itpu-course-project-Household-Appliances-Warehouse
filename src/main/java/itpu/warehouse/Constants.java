package itpu.warehouse;

import itpu.warehouse.entity.Product;

import java.util.HashMap;
import java.util.List;

public interface Constants {
    public static String PRODUCT_TELEVISION = "Television";
    public static String PRODUCT_SMARTPHONE = "SmartPhone";
    public static String PRODUCT_NOTEBOOK = "Notebook";
    public static String PRODUCT_MONITOR = "Monitor";
    public static String PRODUCT_KEYBOARD = "Keyboard";
    public static String PRODUCT_MOUSE = "Mouse";

//  in my case it's mac. you can change with the other file location
    public static String filePath = "/Users/haywan/Desktop/course-work/Products.csv";

    public static HashMap<String, List<Product>> products = new HashMap<>();
}
