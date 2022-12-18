// определяем класс hawk наследуемый от класса Animal и использующие интерфейсы Flyable, Runable ,Speakable
public class Hawk extends Animal implements Flyable, Runable, Speakable {
    // определяем конструктор
    public Hawk(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    //    переопределяем методы FlySpeed, runSpeed, speak and toString
    @Override
    public Integer FlySpeed() {
        return 80;
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }

    @Override
    public String speak() {
        return "AAAAAA";
    }

    @Override
    public String toString() {
        return "hawk" + super.toString();
    }
}
