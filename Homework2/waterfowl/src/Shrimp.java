// определяем класс  Shrimp который наследуется от класса WaterfowlAnimal и интерфейса Swimable
public class Shrimp extends WaterfowlAnimal implements Swimable {

    //    определяем конструктор
    public Shrimp(String type, Integer eyes, String color, String skin) {
        super(type, eyes, color, skin);
    }

    //    переопределяем метод swimspeed and toString
    @Override
    public Integer swimSpeed() {
        return 8;
    }

    @Override
    public String toString() {
        return "Shrimp" + super.toString();
    }
}
