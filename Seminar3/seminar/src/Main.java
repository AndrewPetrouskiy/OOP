import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        Personal secondPersonal = new Personal();
        secondPersonal.addUser(new User("Anita", "Bogomazova", 25))
                .addUser(new User("Anton", "Schebnikov", 22));
        personal.addUser(new User("Andrew", "Petrovskiy", 34))
                .addUser(new User("Alexandra", "Petrovskaya", 29))
                .addUser(new User("Karina", "Petrovskaya", 4))
                .addUser(new User("Andrew", "Petrovskiy", 33));
        User smallBoss = new User("Genadiy", "Antonov", 39, secondPersonal);
        personal.addUser(smallBoss);

        for (User item : personal) {
            System.out.println(item);
        }
        System.out.println("--------------");
        Collections.sort(personal.getUsers());
        personal.forEach(System.out::println);
        System.out.println("--------------------");

        User bigBoss = new User("Boba", "Pypkin", 41, personal);


        Company company = new Company(bigBoss);
        company.forEach(System.out::println);
    }
}