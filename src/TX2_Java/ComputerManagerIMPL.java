package TX2_Java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerManagerIMPL implements ComputerManager {

    private static final String FILE_PATH = "Computer.bin";
    private List<Computer> list;
    int n = 5;

    public ComputerManagerIMPL() {
        list = new ArrayList<>();
        loadFromFile();
    }

    public List<Computer> getComputers() {
        return new ArrayList<>(list); // tra ve mang moi de tranh loi khi xoa
    }

    public void generateList(int n) {
        this.list = new ArrayList<>(n); //list được khởi tạo với kt ban đầu là n, và sau đó các đối tượng Computer được tạo và thêm vào danh sách nà
        String[] t = {"Lenovo", "Dell", "Asus", "HP", "MSI", "MacBook"};
        String[] c = {"Gray", "Black", "White", "Pink", "Blue"};
        String[] m = {"Plastic", "Steel", "Glass", "Aluminium"};
        String[] s = {"Big", "Small", "Old", "Luxury", "Durable"};
        //sinh ngẫu nhiên
        int index;
        for (int i = 0; i < n; i++) {
            Computer computer = new Computer(); //tạo đối tượng computer
            computer.setProduct_id(i);// thiết lập id cho sản phẩm

            index = (int) (Math.random() * t.length);
            computer.setProduct_name(t[index]);

            index = (1000 + (int) (Math.random() * 10000));
            computer.setProduct_price(index);

            index = (int) (Math.random() * 100);
            computer.setProduct_total(index);

            index = (int) (Math.random() * c.length);
            computer.setColor(c[index]);

            index = (int) (Math.random() * m.length);
            computer.setMaterial(m[index]);

            index = (int) (Math.random() * s.length);
            computer.setStyle(s[index]);

            this.list.add(computer);
        }
    }

    @Override
    public boolean addComputer(Computer c) {
        if (c instanceof Computer) {
            list.add(c);
            saveToFile();
            return true;
        }
        return false;
    }

    //ham edit
    @Override
    public boolean editComputer(Computer c) {
        if (c instanceof Computer) {
            Computer computer = (Computer) c;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getProduct_id() == computer.getProduct_id()) {
                    list.set(i, computer);
                    saveToFile();
                    return true;
                }
            }
        }
        return false;
    }

    //ham xoa
    @Override
    public boolean delComputer(Computer c) {
        if (c instanceof Computer) {
            list.remove(c);
            saveToFile();
            return true;
        }
        return false;
    }

    @Override
    public List<Computer> searchComputers(String name) {
        List<Computer> results = new ArrayList<>();
        for (Computer computer : list) {
            if (String.valueOf(computer.getProduct_id()).equalsIgnoreCase(name)
                    || computer.getProduct_name().toLowerCase().equalsIgnoreCase(name.toLowerCase())
                    || String.valueOf(computer.getProduct_price()).equalsIgnoreCase(name)
                    || String.valueOf(computer.getProduct_total()).equalsIgnoreCase(name)
                    || computer.getColor().toLowerCase().equalsIgnoreCase(name.toLowerCase())
                    || computer.getMaterial().toLowerCase().equalsIgnoreCase(name.toLowerCase())
                    || computer.getStyle().toLowerCase().equalsIgnoreCase(name.toLowerCase())) {
                results.add(computer);
            }
        }
        return results;
    }

    //hàm sắp xếp
    public List<Computer> sortedComputer(double price) {
        List<Computer> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.comparing(Computer::getProduct_price)); //sap xep tang dan
        if (price == 0) {
            Collections.reverse(sortedList);
        }
        return sortedList;
    }

    public void loadFromFile() {
        File file = new File(FILE_PATH);//tạo 1 đối tượng file đại diện cho tập tin
        if (!file.exists()) {
            // nếu tt không tồn tại, khởi tạo 1 danh sách rỗng
            list = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            //đọc các đối tượng từ tập tin
            list = (List<Computer>) ois.readObject();
        } catch (FileNotFoundException e) {
            // nếu file khog tồn tại, trả về ds rỗng
            list = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    //ghi ds đối tượng vào tập tin
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
