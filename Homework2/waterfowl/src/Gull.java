// определяем класс Gull который наследуется от класса WaterfowlAnimal и интерфейса Swimable
public class Gull extends WaterfowlAnimal implements Swimable {
    //    определяем конструктор
    public Gull(String type, Integer eyes, String color, String skin) {
        super(type, eyes, color, skin);
    }
//    переопределяем метод swimspeed and toString

    @Override
    public Integer swimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return "gull" + super.toString();
    }
}
