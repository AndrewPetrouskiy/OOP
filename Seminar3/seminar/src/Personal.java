import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Personal implements Iterable<User> {

    public List<User> getUsers() {
        return users;
    }

    public int size(){
        return users.size();
    }
    private List<User> users = new ArrayList<>();

    public Personal addUser(User user){
        users.add(user);
        return this;
    }

    @Override
    public Iterator<User> iterator() {

        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();

            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
}



















