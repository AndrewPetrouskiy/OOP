
public class Main {
    public static void main(String[] args) {
        Comander comander = new Comander("Jack", 1000, new OnehandedAxe(), new SuperGodArmor());
        Team<Archer> team = new Team<>(comander);
        System.out.println(comander);
        team.addNewPerson(new Archer("Mike", 165, new LongBow(), new ArmorBib()));
        team.addNewPerson(new Archer("Legalas", 255, new LongBow(), new ArmorBib()));
        team.forEach(item -> System.out.println(item));
        System.out.println("All damage of the team: " + team.getAllDamage() + " All HP of the team: " + team.getAllHP()
                + " Max Range: " + team.maxRangeBow() + " All spell damage: " + team.getAllMagicDamage()
                + " All team armor: " + team.getAllArmore());

        System.out.println("________ New team-----------");


        Comander comander2 = new Comander("Jane", 1002, new LongBow(), new SuperGodArmor());
        Team<Barbarian> team2 = new Team<>(comander2);
        team2.addNewPerson(new Barbarian("Gimly", 378, new OnehandedAxe(), new TriangleShield()));
        team2.addNewPerson(new Barbarian("Konan", 555, new OnehandedAxe(), new TriangleShield()));
        System.out.println(comander2);
        team2.forEach(item -> System.out.println(item));
        System.out.println("All damage of the team: " + team2.getAllDamage() + " All HP of the team: " + team2.getAllHP()
                + " Max Range: " + team2.maxRangeBow() + " All spell damage: " + team.getAllMagicDamage()
                + " All team armor: " + team2.getAllArmore());

        System.out.println("________ Next team-----------");


        Comander comander3 = new Comander("God", 25000, new LongBow(), new SuperGodArmor());
        Team<Warrior> squad = new Team<>(comander3);
        squad.addNewPerson(new Archer("Dimbly", 201, new LongBow(), new ArmorBib()));
        squad.addNewPerson(new Barbarian("Destroyer", 654, new OnehandedAxe(), new TriangleShield()));
        System.out.println(comander3);
        squad.forEach(item -> System.out.println(item));
        System.out.println("All damage of the team: " + squad.getAllDamage() + " All HP of the team: " + squad.getAllHP()
                + " Max Range: " + squad.maxRangeBow() + " All spell damage: " + team.getAllMagicDamage()
                + " All team armor: " + squad.getAllArmore());

        System.out.println("------------ Four team------------");

        Comander comander4 = new Comander("Great Mage", 1450, new SmallStaff(), new SuperGodArmor());
        Team<Warrior> chichaSquad = new Team<>(comander4);
        chichaSquad.addNewPerson(new Sorcess("Alice", 235, new SmallStaff(), new LongMantle()));
        chichaSquad.addNewPerson(new Sorcess("Ginger", 201, new SmallStaff(), new LongMantle()));
        System.out.println(comander4);
        chichaSquad.forEach(item -> System.out.println(item));
        System.out.println("All damage of the team: " + chichaSquad.getAllDamage() + " All HP of the team: "
                + chichaSquad.getAllHP() + " Max Range: " + chichaSquad.maxRangeBow() + " All spell damage: "
                + chichaSquad.getAllMagicDamage() + " All team armor: " + chichaSquad.getAllArmore());
    }
}