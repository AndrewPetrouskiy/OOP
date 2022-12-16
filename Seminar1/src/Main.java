import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        создаем экземпляр класса Products и вызываем метод println c значениями по умолчанию.
        Products water = new Products("water", 2.54);
        System.out.println(water);

//        создаем экземпляр класса VendingMachine и вызываем метод println c значениями по умолчанию.
        VendingMachine firstProd = new VendingMachine();
        System.out.println(firstProd);

//        создаем ArrayList goods и заполняем его.

        List<Products> goods = new ArrayList<>();
        goods.add(water); // добавляем в список water из экземпляра класса Products
        goods.add(new Products("Burn", 3.15));  // добавляем 3 экземпляра класса Products в этот список.
        goods.add(new Products("bread", 1.15));
        goods.add(new Products("Milk", 2.65));
        goods.add((new IceCream("Summer", 1.79, "cherry"))); // добавляем экземпляр класса IceCream в список
        goods.add((new Chocolate("Mars", 2.01, 150f))); // добавляем экземпляр класса Chocolate в список
        goods.add((new Drinks("Coca-Cola", 3.49, 1.5f))); // добавляем экземпляр класса Drinks в список

//        создаем экземпляр класса VendingMachine и в качестве аргумента передаем туда список goods
        VendingMachine secondGoods = new VendingMachine(goods);
        System.out.println(secondGoods); // выводим в консоль весь список
        List<Products> resultFoundOff = secondGoods.findByName("bread"); // создаем список resultFoundOff и вызываем там метод
        // findByName из VendingMachine и ищем там Bread
        System.out.println(resultFoundOff); // выводим в консоль найденные элементы.
        System.out.println(secondGoods.findByPrice(2.65)); //выводим в консоль через метод findByPrice элемент с price 2.65
        System.out.println(secondGoods.findByRangePrice(1, 2)); // выводим в консоль через метод findByRangePrice
        // элементы в интервале с ценой от 1 до 2


    }
}