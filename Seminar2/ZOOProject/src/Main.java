public class Main {
    public static void main(String[] args) {
//        определяем экземпляр класса Zoo.
    Zoo zoo = new Zoo();
//    добавляем два экземпляра класса Lion and Spider в список. выводим их в консоль.
    zoo.addAnimal(new Lion("Simbo", "Mufasa", 4))
            .addAnimal(new Spider("little", "Piter", 8))
            .addAnimal(new Duck("Doofy" , "Alexandra", 2))
            .addAnimal(new Hawk("Speedster", "Andrew", 2));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println(zoo.getChampionSpeed());
        System.out.println();

        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.FlySpeed());
        }
        System.out.println(zoo.getChampionFlySpeed());

        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());

    }
}