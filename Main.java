public class Main {
    public static void main(String[] args) {
        // Create a base car model
        Car baseCar = new Basemodel ();

        // Add decorators to customize the car
        baseCar = new SportSuspenDecorator(baseCar);
        baseCar = new BodyKitDecorator(baseCar);
        baseCar = new EngineTuneDecorator(baseCar);
        baseCar = new MediaSysDecorator(baseCar);

        // Display the customized car's details
        System.out.println("Customized Car Configuration:");
        System.out.println("Model: " + baseCar.Description ());
        System.out.println("Total Price: $" + baseCar.cost ());
    }
}
