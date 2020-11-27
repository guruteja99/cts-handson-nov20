package streamExamples;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreamLaptops {

	public static void main(String[] args) {
		List<Laptops> laptopsList =Laptops.fetchLaptops();
		System.out.println("-----------Seq----");
		laptopsList.stream().filter(item->item.getRating()>4.3).forEach(item->System.out.println(item));
		System.out.println("-----------Parallel ----");
		laptopsList.parallelStream().filter(item->item.getRating()>4.3).forEach(item->System.out.println(item));
	}
}
