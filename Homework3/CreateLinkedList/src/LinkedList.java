
import java.util.Iterator;

class LinkList<User> implements Iterable<User> {
    private Node<User> node = null;

    private int count = 0;

    public LinkList() {
        node = new Node<User>();
    }

    public int size() {
        return count;
    }

    public void add(User name) {
        if (count == 0) {
            node.set(name);
        } else {
            node.add(name);
        }
        count++;
    }

    @Override
    public Iterator<User> iterator() {
        return new LinkIterator(node);
    }


    private class LinkIterator implements Iterator<User> {
        private Node<User> thisis;

        private boolean isFirst = true;

        LinkIterator(Node<User> node) {
            thisis = node;
        }

        @Override
        public boolean hasNext() {
            if (count == 1 && isFirst) return true;
            return thisis.isNext();
        }

        @Override
        public User next() {
            if (isFirst) isFirst = false;
            else thisis = thisis.next;
            return thisis.get();
        }


    }


}




