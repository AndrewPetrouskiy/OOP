public abstract class Axe implements Weapon{
    @Override
    public String toString() {
        return String.format("The axe has damage: %d", damage());
    }
}
