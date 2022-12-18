public class Main {
    public static void main(String[] args) {
//        определяем экземпляр класса Zoo.
        Zoo zoo = new Zoo();
//    добавляем экземпляры класса Lion , Duck, Hawk and Spider в список. выводим их в консоль.
        zoo.addAnimal(new Lion("Simbo", "Mufasa", 4))
                .addAnimal(new Spider("little", "Piter", 8))
                .addAnimal(new Duck("Doofy", "Alexandra", 2))
                .addAnimal(new Hawk("Speedster", "Andrew", 2));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
//        выводим в консоль скорости бега животных.
        for (Runable i : zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
//        выводим в консоль максимальную скорость бега среди животных
        System.out.println(zoo.getChampionSpeed());
        System.out.println();
//        выводим в консоль скорости полета животных.
        for (Flyable i : zoo.getFlyable()) {
            System.out.println(i.FlySpeed());
        }
        //        выводим в консоль максимальную скорость полета среди животных
        System.out.println(zoo.getChampionFlySpeed());
// сохраняем данные животных в файл.
        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());

    }
}