package TX2_Java;

import java.io.Serializable;
import java.util.Scanner;
public class Product implements Serializable{
    private static final long serialVersionUID = 1L; // Đảm bảo tính tương thích khi tuần tự hóa
    private int product_id;
    private String product_name;
    private double product_price;
    private int product_total;

    public Product() {
    }

    public Product(int product_id, String product_name, double product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }

}
