// определяем класс  Shark который наследуется от класса WaterfowlAnimal и интерфейса Swimable
public class Shark extends WaterfowlAnimal implements Swimable {


    //    определяем конструктор
    public Shark(String type, Integer eyes, String color, String skin) {
        super(type, eyes, color, skin);
    }

    //    переопределяем метод swimspeed and toString
    @Override
    public Integer swimSpeed() {
        return 45;
    }

    @Override
    public String toString() {
        return "Shark" + super.toString();
    }
}
