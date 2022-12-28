public abstract class Warrior<T extends Weapon, S extends Armor> {


    private String name;
    int healthpoint;
    private T weapon;
    private S armor;


    public Warrior(String name, int healthpoint, T weapon, S armor) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public void setArmor(S armor) {
        this.armor = armor;
    }

    public S getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return String.format("name:" + name + " HP: " + healthpoint + " weapon: " + weapon.toString() + " armor "
                + armor.toString());
    }


}
