import java.util.Random;

public class ArmorBib extends Bib{
    @Override
    public int armor() {
        return new Random().nextInt(120, 200);
    }

    @Override
    public String toString() {
        return  String.format("The bib has Armor: %d", armor());
    }
}
