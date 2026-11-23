import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		
		        ArrayList al = new ArrayList();
		        al.add(20);
		        al.add(30);
		        al.add(10);
		        al.add(40);
		        al.add(50);
		        System.out.println(al);
		        System.out.println(al.size());
		        System.out.println(al.contains(300));
		        System.out.println(al.contains(30));
		        System.out.println(al.indexOf(20));
		        System.out.println(al.get(1));
		        System.out.println(al.isEmpty());
		       al.add(99);
		       System.out.println(al);
		       al.add(30);
		       System.out.println(al);
		       System.out.println(al.indexOf(30));
		       System.out.println(al.lastIndexOf(30));
		       System.out.println(al);
		       al.remove(6);
		       System.out.println(al);
		       al.removeFirst();
		       System.out.println(al);
		       al.addFirst(73);
		       System.out.println(al);
		       al.set(3, "Raja");
		       System.out.println(al);
		       al.add(2,37.8);
		       System.out.println(al);
		       ArrayList al1 = new ArrayList();
		       al1.add(77);
		       al1.add(88);
		       al1.add(738);
		       System.out.println(al1);
		       System.out.println(al);
		       al.addAll(al1);
		       System.out.println(al);
		       
		       
	}

}
