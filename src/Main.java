public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
              new Car("car1", 4),
              new Car("car2", 4)
        };
        Truck[] trucks = new Truck[]{
                new Truck("truck1", 4),
                new Truck("truck2", 4)
        };
        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("bicycle1", 4),
                new Bicycle("bicycles2", 4)
        };
        Transport[] transports = new Transport[cars.length + trucks.length+bicycles.length];
            for (int i = 0; i < cars.length; i++) {
                transports[i] = cars[i];
            }
            for (int i = 0; i < trucks.length; i++) {
                transports[i + cars.length] = trucks[i];
            }
            for (int i = 0; i < bicycles.length; i++) {
                transports[i + cars.length + trucks.length] = bicycles[i];
            }

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.check(transports);





    }
}
