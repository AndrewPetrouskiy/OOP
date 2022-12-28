import java.util.Random;

public class SmallStaff extends Staff{

    @Override
    public int damage() {
        return new Random().nextInt(3, 8);
    }


    @Override
    public int spell() {
        return new Random().nextInt(10, 30);
    }

    @Override
    public String toString() {
        return "Small staff" + super.toString();
    }
}
