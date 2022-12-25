public class Node<E> {
    private E name;

    public Node<E> next = null;

    Node(){}

    Node(E name){
        set(name);
    }

    void set(E name){
        this.name = name;
    }


    void  add(E name) {
        if (isNext()) {
            next.add(name);
        } else {
            next = new Node<>(name);
        }
    }
        E get(){
            return name;
        }


        boolean isNext(){
            return next !=null;
        }
    }

