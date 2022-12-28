import java.util.Random;

public class SuperGodArmor extends GodArmor{
    @Override
    public int armor() {
        return new Random().nextInt(1200, 5000);
    }

    @Override
    public String toString() {
        return String.format("The God Armor has an armor: %d", armor());
    }
}



