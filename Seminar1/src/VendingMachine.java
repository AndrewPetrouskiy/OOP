import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// создаем класс VendingMachine и заполняем его.
public class VendingMachine {
    //    создаем приватное поле products
    private List<Products> products;

    private static List<Products> DEFAULT = new ArrayList<>(Arrays.asList(new Products("red bull", 3.50)));

    //    заполняем конструктор
    public VendingMachine(List<Products> products) {
        this.products = products;
    }

    //    заполняем конструктор по умолчнию
    public VendingMachine() {
        this(DEFAULT);
    }

    //  определяем метод toString
    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    //    определяем метод findName для поиска элемента name в списке
    public List<Products> findByName(String name) {
        List<Products> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getName().equals(name)) {
                result.add(i);
            }
        });
        return result;
    }

    //    определяем метод findByPrice для поиска элемента price в списке
    public List<Products> findByPrice(double price) {
        List<Products> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice() == price) {
                result.add(i);
            }
        });
        return result;
    }

    //    определяем метод findByRangePrice для поиска элемента price в списке в интервале цен.
    public List<Products> findByRangePrice(double price1, double price2) {
        List<Products> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice() > price1 && i.getPrice() < price2) {
                result.add(i);
            }
        });
        return result;
    }
}
