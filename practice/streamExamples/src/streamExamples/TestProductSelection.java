package streamExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProductSelection {

	public static void main(String[] args) {

		
		List<Laptops> laptopsList = Laptops.fetchLaptops();
		
		List<Laptops> particularLaptops = new ArrayList<Laptops>();
		
		for (Laptops laptops : laptopsList) {
			if(laptops.getBrandName().equalsIgnoreCase("Lenova"))
				particularLaptops.add(laptops);
		}
		Collections.sort(particularLaptops, (l2,l1)->Double.compare(l1.getRating(), l2.getRating()));
		
		particularLaptops.forEach(laptops -> System.out.println(laptops));
		
	}

}
