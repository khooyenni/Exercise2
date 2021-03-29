package Example2;

public class Main {

	public static void main(String[] args) {
		
		BreakfastMaker a = new BreakfastMaker();
		System.out.println("Brand: " + a.brand);
		System.out.println("Voltage: " + a.voltage);
		System.out.println("Oven Capacity: " + a.ovenCapacity);
		a.bake();
		a.toast();
		a.fry();
		
		System.out.println();
		
		MicrowaveOven b = new MicrowaveOven();
		System.out.println("Brand: " +b.brand);
		System.out.println("Model: " + b.model);
		System.out.println("Oven Capacity: " + b.ovenCapacity);
		b.bake();
		b.grill();
		b.defrost();
		

	}

}
