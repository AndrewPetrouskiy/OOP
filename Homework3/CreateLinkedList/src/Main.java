public class Main {
    public static void main(String[] args) {
        LinkList<User> linkedList = new LinkList<>();
        linkedList.add(new User("Andrew", "Petrovskiy", 34));
        linkedList.add(new User("Alexandr", "Danilko", 22));
        linkedList.add(new User("Karina", "Paginia", 4));
        for (User item: linkedList) {
            System.out.println(item);
        }
    }
}