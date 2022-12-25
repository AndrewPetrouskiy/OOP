public class Node<User> {
    private User name;

    public Node<User> next = null;

    Node(){}

    Node(User name){
        set(name);
    }

    void set(User name){
        this.name = name;
    }


    void  add(User name) {
        if (isNext()) {
            next.add(name);
        } else {
            next = new Node<>(name);
        }
    }
    User get(){
            return name;
        }


        boolean isNext(){
            return next !=null;
        }
    }

