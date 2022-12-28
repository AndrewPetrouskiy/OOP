import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> team = new ArrayList<>();
    private Comander comander;

    public Team(Comander comander) {

        this.comander = comander;
    }

    public Comander getComander() {
        return comander;
    }

    public void addNewPerson(T newWarrior) {
        team.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for (T item : team) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllArmore() {
        int sumArmore = 0;
        for (T item : team) {
            sumArmore += item.getArmor().armor();
        }
        return sumArmore;
    }

    public int getAllMagicDamage() {
        int sumDamage = 0;
        for (T item : team) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Staff) {
                Staff damage = (Staff) weapon;
                sumDamage += damage.spell();
            }
        }
        return sumDamage;
    }

    public int getAllHP() {
        int sumHP = 0;
        for (T item : this) {
            sumHP += item.getHealthpoint();
        }
        return sumHP;
    }

    public int maxRangeBow() {
        int maxRange = 0;
        for (T item : team) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (bow.range() > maxRange) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }
}
