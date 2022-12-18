public class Duck extends Animal implements Flyable, Speakable, Runable {

    public Duck(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

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
