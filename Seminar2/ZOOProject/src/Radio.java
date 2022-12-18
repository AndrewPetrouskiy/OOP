// определяем класс radio наследуемое интерфейс speakable
public class Radio implements Speakable{

//    определяем метод speak которое выводит какая станция играет.
    @Override
    public String speak() {
        return "AU FM";
    }
}
