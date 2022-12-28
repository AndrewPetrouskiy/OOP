public class Barbarian extends Warrior<Axe, Shield>{
    public Barbarian(String name, int healthpoint, Axe weapon, Shield armor) {
        super(name, healthpoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Barbarian: " +  super.toString();
    }
}
