public class SportSuspenDecorator implements Car{

    private Car car;

    public SportSuspenDecorator(Car car){
        this.car=car;
    }

    @Override
    public int cost () {
        return car.cost ()+100000;
    }

    @Override
    public String Description () {
        return ",Coilovers,";
    }
}
