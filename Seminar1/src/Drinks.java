public class Drinks extends Products {
    // определяем класс Drinks который наследуется от класса Product

    //    заполняем конструктор

    public Drinks(String name, double price, Float volume) {
        super(name, price);
        this.volume = volume;
    }

    //    делаем приватное поле volume
    private Float volume;

    //    определяем метод getter

    public Float getTaste() {
        return volume;
    }

    // переопределяем родительский метод toString

    public String toString() {
        return String.format("%s - volume: %.2f liters", super.toString(), volume);
    }
}

