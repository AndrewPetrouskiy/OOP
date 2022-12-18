import java.util.ArrayList;
import java.util.List;

// определяем класс Zoo
public class Zoo {
    public List<Animal> getAnimals() {
        return animals;
    }

    //    определяем поле animals
    private List<Animal> animals = new ArrayList<>();

    // определяем метод заполнения листа addAnimal
    public Zoo addAnimal(Animal beast) {
        animals.add(beast);
        return this;
    }

    // определяем метод toString.
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            stringBuilder.append(item.speak() + "\n");
        }
        return stringBuilder.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable) {
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public Integer getChampionSpeed() {
        int max = 0;

        for (Runable i : getRunable()) {
            if (i.runSpeed() > max) {
                max = i.runSpeed();
            }
        }
        return max;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public Integer getChampionFlySpeed() {
        int max = 0;

        for (Flyable i : getFlyable()) {
            if (i.FlySpeed() > max) {
                max = i.FlySpeed();
            }
        }
        return max;
    }

}
