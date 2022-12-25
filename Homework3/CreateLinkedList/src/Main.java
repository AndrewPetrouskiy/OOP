public class Main {
    public static void main(String[] args) {
        LinkList<String> linkedList = new LinkList<>();
        linkedList.add("Andrew");
        linkedList.add("Alexandr");
        for (String item: linkedList) {
            System.out.println(item);
        }
    }
}