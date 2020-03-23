import java.util.*;
public interface StackInterface<E> {
        void push (E element) throws FullStackException;
        E pop() throws EmptyStackException;
        int size();
}
