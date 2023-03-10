// определяем класс Spider наследуемый от Animal и использующий интерфейсы Speakable , Runable
public class Spider extends Animal implements Speakable, Runable {
    //    определяем конструктор.
    public Spider(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    //    @Override
//    public String voice() {
//        return "psss-sss-sss";
//    }

    //    переопределяем методы runSpeed, speak and toString
    @Override
    public String speak() {
        return "psss-sss-sss";
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return "sdider" + super.toString();
    }
}
