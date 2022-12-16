public class Chocolate extends Products{

    // определяем класс IceCream который наследуется от класса Product

    //    заполняем конструктор

    public Chocolate(String name, double price, Float weight) {
        super(name, price);
        this.weight = weight;
    }

    //    делаем приватное поле weight
    private Float weight;

    //    определяем метод getter

    public Float getTaste() {
        return weight;
    }

    // переопределяем родительский метод toString

    public String toString(){
        return String.format("%s - weight: %.2f grams", super.toString(), weight);
    }
}
