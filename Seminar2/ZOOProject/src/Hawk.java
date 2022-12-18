public class Hawk extends Animal implements Flyable, Runable,Speakable{

    public Hawk(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

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
