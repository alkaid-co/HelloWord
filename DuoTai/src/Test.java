import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Animals dog1 = new Dog(1);
        Dog dog2 = new Dog(2);
        Dog dog3=(Dog) dog1;
        dog1.eat();
        dog2.eat();
        dog2.play();
        dog3.play();
        Animals.sta();
        System.out.println("================================");
        Animals a1 = new Animals(4);
        Animals a2 = new Animals(9);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode()==a2.hashCode());//hashcode 没被重写就会输出false.



/*        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        queue.offer(1);
        queue.offer(2);
        stack.push(1);
        stack.push(2);
        System.out.println(queue.peek()+"  "+stack.peek());
        String s;*/
    }
}
