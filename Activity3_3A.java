package JavaActivity1;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {
	
	public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println("Print the queue:" +q);
        System.out.println("Remove number in the queue:" +q.remove(3));
        System.out.println("Peek the first number:" + q.peek());
        System.out.println("The size of queue is:" +q.size());
        System.out.println("Print the updated queue:" +q);
        
        
		
		
	}

}
