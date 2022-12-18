// определяем класс Duck наследуемый от класса Animal и использующие интерфейсы Flyable, Runable ,Speakable
public class Duck extends Animal implements Flyable, Speakable, Runable {
    // определяем конструктор
    public Duck(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    //    переопределяем методы FlySpeed, runSpeed, speak and toString
    @Override
    public Integer FlySpeed() {
        return 55;
    }

    @Override
    public String speak() {
        return "Kria - Kria motherfucker";
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
