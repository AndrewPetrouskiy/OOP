import java.util.Random;

public class TriangleShield extends Shield{
    @Override
    public int armor() {
        return new Random().nextInt(200, 500);
    }

    @Override
    public String toString() {
        return  String.format("The shield has an armor: %d", armor());
    }
}
