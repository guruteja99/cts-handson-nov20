package streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestImpl {

	public static void main(String[] args) {

		/*List<Laptops> laptopsList =Laptops.fetchLaptops();
		List<Laptops> reqList = laptopsList.stream().filter(item->item.getBrandName().equals("Lenovo")).collect(Collectors.toList());
		for (Laptops laptops : reqList) {
			System.out.println(laptops);
		}*/
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(15);
		list.add(6);
		int max = list.stream().max((l1,l2)->l1.compareTo(l2)).get();
	/*	if(max.isPresent()) {
				int num =max;
		}*/
		System.out.println(max);
	}
}
