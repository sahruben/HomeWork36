public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Size of the stack: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.isEmpty()) {
            System.out.println("Popped element: " + intStack.pop());
        }

    }
}