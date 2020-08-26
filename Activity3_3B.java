package JavaActivity1;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();
        dq.addFirst("Wolf");
        dq.addLast("Lion");
        dq.add("Fish");
        dq.add("Tiger");
        dq.add("Dog");
        dq.add("Monkey");
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
           System.out.println("Peek first: " + dq.peekFirst());
           System.out.println("Peek last: " + dq.peekLast());
            System.out.println("After peek: " + dq);
            System.out.println("Contains Wolf: " + dq.contains("Wolf"));
            System.out.println("Print of deque before removal: " + dq);

         dq.removeFirst();
           dq.removeLast();
            System.out.println("dq after removing first and last elements: " + dq);
            System.out.println("Size of deque after removal: " + dq.size());

        }
 

	}

