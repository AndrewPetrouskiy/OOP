public class Comander extends Warrior<Weapon, GodArmor>{

    public Comander(String name, int healthpoint, Weapon weapon, GodArmor armor) {
        super(name, healthpoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
