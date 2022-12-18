// создаем абстрактный класс Animal
public abstract class Animal {
    //    Определяем приватные поля nickname, owner, legs
    private String nickName;
    private String owner;
    private int legs;

    //    Определяем конструктор
    public Animal(String nickName, String owner, int legs) {
        this.nickName = nickName;
        this.owner = owner;
        this.legs = legs;
    }
//    определяем getter на nickname, owner and legs

    public String getNickName() {
        return nickName;
    }

    public String getOwner() {
        return owner;
    }

    public int getLegs() {
        return legs;
    }

    //    определяем метод toString
    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", owner='" + owner + '\'' +
                ", legs=" + legs +
                '}';
    }


}
