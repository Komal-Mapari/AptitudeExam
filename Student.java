package AptitudeTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Student {
   public static void main(String[] args) {
	
	   ArrayList<String> al=new ArrayList<>();
	   
	   al.add("roll");
	   al.add("name");
	   al.add("marks");
	   
	   System.out.println(al);
	   
	   HashSet<String> hs=new HashSet(al);
	   System.out.println("decending order : "+ hs);
	   
	   System.out.println("--------------------------------");
	   
	   TreeSet<String> ts=new TreeSet<>(al);
	   System.out.println("Asending Order : "+ts);
	   
	   
}
}
