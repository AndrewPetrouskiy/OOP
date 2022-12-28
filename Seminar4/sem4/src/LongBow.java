import java.util.Random;

public class LongBow extends Bow{
    @Override
    public int range() {
        return new Random().nextInt(50, 100);
    }

    @Override
    public int damage() {
        return new Random().nextInt(8, 13);
    }

    @Override
    public String toString() {
        return "LongBow " + super.toString();
    }
}
