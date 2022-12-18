import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveManager {
    public void save(List<Animal> animals){
        FileWriter writer = null;
        try {
            writer = new FileWriter("Animallist.txt", false);
            for (Animal i: animals) {
                writer.write(i.toString() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
