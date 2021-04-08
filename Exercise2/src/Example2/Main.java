package Example2;

public class Main {

	public static void main(String[] args) {
		
		BreakfastMaker Sunpentown = new BreakfastMaker();
		System.out.println("Brand: " + Sunpentown.brand);
		System.out.println("Voltage: " + Sunpentown.voltage);
		System.out.println("Oven Capacity: " + Sunpentown.ovenCapacity);
		Sunpentown.bake();
		Sunpentown.toast();
		Sunpentown.fry();
		
		System.out.println();
		
		Tablet Huawei = new Tablet();
		System.out.println("Brand: " + Huawei.brand);
		System.out.println("Model: " + Huawei.model);
		System.out.println("Oven Capacity: " + Huawei.colour);
		Huawei.call();
		Huawei.youtube();
		Huawei.notification();

	}

}
