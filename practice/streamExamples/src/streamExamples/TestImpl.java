package streamExamples;

import java.util.List;
import java.util.stream.Collectors;

public class TestImpl {

	public static void main(String[] args) {

		List<Laptops> laptopsList =Laptops.fetchLaptops();
		List<Laptops> reqList = laptopsList.stream().filter(item->item.getBrandName().equals("Lenovo")).collect(Collectors.toList());
		for (Laptops laptops : reqList) {
			System.out.println(laptops);
		}
	}
}
