public class CircularQueueByArray {
    int arr[];
    int size, beginning, top;

    public CircularQueueByArray(int size) {
        arr = new int[size];
        this.size = size;
        beginning = top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == beginning || ((beginning == 0) && (top + 1 == size));
    }

    public void enqueue(int value) {
        if (isFull())
            System.out.println("Overflow!");
        else if (isEmpty()) {
            beginning = top = 0;
            arr[beginning] = value;
        } else {
            if (top + 1 == size)
                top = 0;
            else
                top++;
            arr[top] = value;
        }
        System.out.println("Inserted -> " + arr[top]);
    }

    public void dequeue() {
        if (isEmpty())
            System.out.println("Empty!");
        else {
            System.out.println("Deleted -> " + arr[beginning]);
            if (beginning == top) {
                beginning = top = -1;
                System.out.println("Queue Cleared!");
            } else if (beginning + 1 == size)
                beginning = 0;
            else
                beginning++;
        }
    }

    public void traverse() {
        if (beginning < top) {
            for (int i = beginning; i < top; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } else {
            for (int i = beginning; i < size; i++)
                System.out.print(arr[i] + " ");
            for (int i = 0; i <= top; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
