import java.util.Random;

public class OnehandedAxe extends Axe {
    @Override
    public int damage() {
        return new Random().nextInt(11, 15);
    }

    @Override
    public String toString() {
        return String.format("One-handed axe has damage: %d ", damage());
    }
}
