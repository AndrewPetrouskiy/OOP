//определяем родительский класс WaterfowlAnimal
public abstract class WaterfowlAnimal {

    // задаем поля type, eyes, color, skin
    private String type;
    private Integer eyes;
    private String color;
    private String Skin;

    //    определяем конструктор.
    public WaterfowlAnimal(String type, Integer eyes, String color, String skin) {
        this.type = type;
        this.eyes = eyes;
        this.color = color;
        Skin = skin;
    }

    // определяем getter
    public String getType() {
        return type;
    }

    public Integer getEyes() {
        return eyes;
    }

    public String getColor() {
        return color;
    }

    public String getSkin() {
        return Skin;
    }

//    определяем метод toString

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", eyes=" + eyes +
                ", color='" + color + '\'' +
                ", Skin='" + Skin + '\'' +
                '}';
    }


}
