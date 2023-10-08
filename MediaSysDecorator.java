public class MediaSysDecorator implements Car{

    private Car car;
    public MediaSysDecorator(Car car){
        this.car = car;
    }
    @Override
    public int cost () {
        return car.cost ()+50000;
    }

    @Override
    public String Description () {
        String s = ",Harman/Kardon audio system";
        return s;
    }
}
