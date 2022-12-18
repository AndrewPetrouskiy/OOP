// определяем класс Ocean в которое добавим птиц и рыб которые тут могут обитать.

import java.util.ArrayList;
import java.util.List;

public class Ocean {
    //    определяем поле waterfowAnimals
    private List<WaterfowlAnimal> waterfowlAnimals = new ArrayList<>();

    // добавляем getter
    public List<WaterfowlAnimal> getWaterfowlAnimals() {
        return waterfowlAnimals;
    }

    //    определяем метод заполнения списка животными.
    public Ocean addWaterfowlAnimal(WaterfowlAnimal animal) {
        waterfowlAnimals.add(animal);
        return this;
    }

    // определяем метод toString
    @Override
    public String toString() {
        return "WaterfowlAnimals: " + waterfowlAnimals;
    }

    //    заполняем список скоростей плаванья животных.
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (WaterfowlAnimal item : waterfowlAnimals) {
            if (item instanceof Swimable) {
                result.add((Swimable) item);
            }
        }
        return result;
    }

    //    определяем метод который показывает скорость существа которое плавает медленее всего
    public Integer getMostSlowAnimal() {
        Integer min = Integer.MAX_VALUE;
        for (Swimable i : getSwimable()) {
            if (i.swimSpeed() < min) {
                min = i.swimSpeed();
            }
        }
        return min;
    }

}







