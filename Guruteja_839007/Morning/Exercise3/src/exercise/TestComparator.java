package exercise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		for(Items item : list) System.out.println(item);

		System.out.println("---- Sorting By name ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i1.getName().compareTo(i2.getName());
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Id ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i1.getId()-i2.getId();
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Price ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return (int) (i1.getPrice()-i2.getPrice());
			}
		});
		for(Items item : list)  System.out.println(item);
		
	}
}
