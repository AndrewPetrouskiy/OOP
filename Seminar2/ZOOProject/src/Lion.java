// определяем класс Lion наследуемый от Animal и использующий интерфейсы Speakable , Runable

public class Lion extends Animal implements Speakable, Runable {

    // определяем конструктор
    public Lion(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

//    @Override
//    public String voice() {
//        return "Rrr - Rrr";
//    }

    //    переопределяем методы runSpeed, speak and toString
    @Override
    public String speak() {
        return "Rrr - Rrr";
    }

    @Override
    public Integer runSpeed() {
        return 45;
    }

    @Override
    public String toString() {
        return "lion" + super.toString();
    }
}
