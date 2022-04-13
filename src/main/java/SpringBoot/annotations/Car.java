package SpringBoot.annotations;

import org.springframework.stereotype.Component;

@Component(value="componentCar")
public class Car {
	@Override
	public String toString() {
		return "Car [strCarName=" + strCarName + "]";
	}

	public String strCarName = "componentCarName";

}
