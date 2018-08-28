package structural.compositedesign;

import java.util.ArrayList;
import java.util.List;

public class Cabinate implements Component {

	private int price;
	List<Component> cabinateComponents = new ArrayList<>();

	public Cabinate() {
		
	}
	public Cabinate(List<Component> cabinateComponents) {
		this.cabinateComponents = cabinateComponents;
	}
	@Override
	public double showPrice() {
		if (!cabinateComponents.isEmpty()) {
			return cabinateComponents.stream().mapToDouble(x -> x.showPrice()).sum();

		} else {
			return 0;
		}

	}

}
