public class EngineTuneDecorator implements Car{
private Car car;

public EngineTuneDecorator(Car car){
    this.car = car;
}

    @Override
    public int cost () {
        return car.cost ()+20000;
    }

    @Override
    public String Description () {
        return ",350hp(50 more than in base model),";
    }
}
