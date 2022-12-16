public class IceCream extends Products {
// определяем класс IceCream который наследуется от класса Product

    //    заполняем конструктор
    public IceCream(String name, double price, String taste) {
        super(name, price);
        this.taste = taste;
    }

    //    делаем приватное поле taste
    private String taste;

//    определяем метод getter

    public String getTaste() {
        return taste;
    }

    // переопределяем родительский метод toString
    public String toString() {
        return String.format("%s - taste: %s ", super.toString(), taste);
    }
}
