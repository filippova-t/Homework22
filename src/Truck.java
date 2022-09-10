public class Truck extends Vehicle implements Tyres, Engine, Trailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}