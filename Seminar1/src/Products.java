public class Products {
//    создаем класс Products и будем его заполнять.
//    делаем приватные поля name and price
    private String name;
    private double price;

//    создаем конструктор.
    public Products(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }
//    создаем getter and setter name and price
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//  определяем метод toString
    public String toString(){
        return String.format("name: %s, price: %.2f rubles", name, price);
    }
}
