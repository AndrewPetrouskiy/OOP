public class Archer extends Warrior<Bow, Bib> {

    public Archer(String name, int healthpoint, Bow bow, Bib armor) {
        super(name, healthpoint, bow, armor);
    }

    @Override
    public String toString() {
        return "Archer: " + super.toString();
    }
}
