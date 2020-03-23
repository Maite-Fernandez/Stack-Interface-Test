import java.util.*;
public class Stack<E> implements StackInterface<E> {
    private int max_size;
    private Vector<E> stack;
    //Constructor method
    public Stack(int size){
        this.stack = new Vector();
        max_size=size;
    }
    @Override
    //Size method
    public int size(){

        return stack.size();
    }
    @Override
    //Push method
    public void push(E e) throws FullStackException {
        //When the stack is not full we add the element
        if(stack.size()<max_size){
            stack.add(e);
            //Return 0 when the element was added correctly

        }
        else{
            //Return -1 when the stack is full
           throw new FullStackException();
        }
    }
    @Override
    //Pop method
    public E pop() throws EmptyStackException{
        //Return -1 when the stack is empty
        if(stack.size()==0){
            throw new EmptyStackException(); //return -1;
        }
        else{
            //When the stack is not empty we remove the last element
            E e = stack.remove(stack.size()-1);
            //Return 0 when the element was removed correctly
            return e;
        }
    }
}