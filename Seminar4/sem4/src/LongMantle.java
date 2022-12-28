import java.util.Random;

public class LongMantle extends Mantle{
    @Override
    public int armor() {
        return new Random().nextInt(50, 100);
    }

    @Override
    public String toString() {
        return  String.format("The mantle has an armor: %d", armor());
    }
}
