package JavaActivity1;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
myList.add("Alen");
myList.add("Max");
myList.add("Chris");
myList.add("Nic");
myList.add("Benny");
for(String names :myList) {
	System.out.println(names);
}
	System.out.println("Third element is:" + myList.get(3));
	System.out.println("Check if name exist:" + myList.contains("Nic"));
	System.out.println("Get the size:"  + myList.size());
	System.out.println("Remove name:" + myList.remove("Alen"));
	System.out.println("Get the size:"  + myList.size());
}
	}

