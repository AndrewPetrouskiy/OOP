public abstract class Staff implements Weapon{

    public abstract int spell();

    @Override
    public String toString() {

        return String.format("Урон от удара посохом: %d, урон магией: %d", damage(), spell());
    }
}
