public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age, Personal valet) {
        this(firstName, lastName, age);
        this.valet = valet;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Personal getValet() {
        return valet;
    }



    private Personal valet = new Personal();


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(User o) {
        String fullName = this.firstName + " " + this.lastName;
        String fullNameO = o.firstName + " " + o.lastName;
        if (fullName.equals(fullNameO)) {
            return this.age - o.age;
        }
        return fullName.compareTo(fullNameO);
    }
}
