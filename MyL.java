public class MyL {
    public interface MyList<E> extends Iterable<E>{
        void add(E element);
        void add(E element, int index);
        E get(int index);
        boolean remove(E element);
        E remove(int index);
        int size();
        boolean contains(Object o);
        void clear();
        int indexOf(Object o);
        int lastIndexOf(Object o);
        void sort();
    }}
}
