public class Sorcess extends Warrior<Staff, Mantle>{
    public Sorcess(String name, int healthpoint, Staff weapon, Mantle armor) {
        super(name, healthpoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Sorcess: " + super.toString();
    }
}
