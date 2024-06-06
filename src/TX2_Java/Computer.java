package TX2_Java;
import java.util.Scanner;
import java.io.Serializable;
public class Computer extends Product implements  Serializable{
    private static final long serialVersionUID = 1L; // Đảm bảo tính tương thích khi tuần tự hóa
    private String color;
    private String material;
    private String style;

    public Computer() {}

    public Computer(int product_id, String product_name, double product_price, int product_total, String color, String material, String style) {
        super(product_id, product_name, product_price, product_total);
        this.color = color;
        this.material = material;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
