// определяем класс Lion наследуемый от Animal
public class Lion extends Animal implements  Speakable , Runable{
    public Lion(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

//    @Override
//    public String voice() {
//        return "Rrr - Rrr";
//    }

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
