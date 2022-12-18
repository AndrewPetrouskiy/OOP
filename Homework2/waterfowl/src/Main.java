/*Создать интерфейс, скорость плаванья
Добавить новое животное, способное плавать
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре **/

public class Main {
    public static void main(String[] args) {
//        определяем экземпляр класса waterAnimals
        Ocean waterAnimals = new Ocean();
//        добавляем в список существ экземпляры классов Gull, Shark, Shrimp
        waterAnimals.addWaterfowlAnimal(new Gull("bird", 2, "white", "feathers"))
                .addWaterfowlAnimal(new Shark("fish", 2, "grey", "scales"))
                .addWaterfowlAnimal(new Shrimp("crayfish", 2, "green", "scales"));
//        выводим в консоль список существ
        System.out.println(waterAnimals.toString());
//        выводим в консоль скорости существ.
        speed(waterAnimals);
//        выводим в консоль скорость самого медленного существа.
        System.out.print("The most slow speed between all the animals is: ");
        System.out.println(waterAnimals.getMostSlowAnimal());
    }

    // определяем статический метод который выводит скорость существ в консоль.
    public static void speed(Ocean waterAnimals) {
        for (Swimable i : waterAnimals.getSwimable()) {
            System.out.println("speed: " + i.swimSpeed() + "\n");
        }
    }
}