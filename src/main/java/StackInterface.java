import java.util.*;
public interface StackInterface<E> {
    //YOU DO NOT UNDERSTAND INTERFACES
        void push (E element) throws PilaLlenaException;
        E pop() throws PilaVaciaException;
        int size();
}
