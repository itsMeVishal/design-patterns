package structural.compositedesign;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component{

	private int price;
	List<Component> computerComponents = new ArrayList<>();
	public Computer() {
	
	}
	
	public Computer(List<Component> computerComponents) {
		this.computerComponents = computerComponents;
	}
	
	@Override
	public double showPrice() {
		if (!computerComponents.isEmpty()) {
			return computerComponents.stream().mapToDouble(x -> x.showPrice()).sum();

		} else {
			return 0;
		}

	}

}
