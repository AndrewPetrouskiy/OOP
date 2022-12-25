
import java.util.Iterator;

class LinkList<E> implements Iterable<E> {
    private Node<E> node = null;

    private int count = 0;

    public LinkList() {
        node = new Node<E>();
    }

    public int size() {
        return count;
    }

    public void add(E name) {
        if (count == 0) {
            node.set(name);
        } else {
            node.add(name);
        }
        count++;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkIterator(node);
    }


    private class LinkIterator implements Iterator<E> {
        private Node<E> thisis;

        private boolean isFirst = true;

        LinkIterator(Node<E> node) {
            thisis = node;
        }

        @Override
        public boolean hasNext() {
            if (count == 1 && isFirst) return true;
            return thisis.isNext();
        }

        @Override
        public E next() {
            if (isFirst) isFirst = false;
            else thisis = thisis.next;
            return thisis.get();
        }


    }


}




