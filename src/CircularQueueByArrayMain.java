public class CircularQueueByArrayMain {
  public static void main(String[] args) {
    CircularQueueByArray obj = new CircularQueueByArray(3);
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    //obj.enqueue(40);
    obj.traverse();
    System.out.println("dequeue");
    obj.dequeue();

    System.out.println("======");
    obj.traverse();

    obj.enqueue(40);
    System.out.println("========");
    obj.traverse();
    obj.dequeue();
    obj.dequeue();
    obj.dequeue();
    obj.enqueue(100);
    obj.enqueue(200);
    obj.enqueue(300);
    System.out.println("==============");
    obj.traverse();

}}
