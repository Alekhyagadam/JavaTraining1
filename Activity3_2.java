package JavaActivity1;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("obj1");
        hs.add("obj2");
        hs.add("obj3");
        hs.add("obj4");
        hs.add("obj5");
        hs.add("obj6");
        System.out.println("The size of hashset is:" + hs.size());
        System.out.println("Remove and element:" + hs.remove("obj3"));
        System.out.println("Remove and element:" + hs.remove("obj9"));
        System.out.println("Check if an element is present in the set:" + hs.contains("obj1"));
        System.out.println("Print updated hashset:" + hs);

        
	}

}
