import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        T poppedElement = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedElement;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);

    }
}
