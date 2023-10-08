public class BodyKitDecorator implements Car{
private Car car;
public BodyKitDecorator(Car car){
    this.car=car;
}

    @Override
    public int cost () {
        return car.cost ()+120000;
    }

    @Override
    public String Description () {
        return ",M package,";
    }
}
