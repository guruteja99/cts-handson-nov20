package streamExamples;

import java.util.List;

public class TestGettignameusingStreams {

	public static void main(String[] args) {

		List<Laptops> laptopsList = Laptops.fetchLaptops();
		laptopsList.stream().map(item->item.getBrandName()).distinct().forEach(item->System.out.println(item));
	}

}
