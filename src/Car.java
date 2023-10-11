public class Car extends MotorTransport {
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void servis() {
    System.out.println("Обслуживаем "+modelName);
            for(
    int i = 0;
    i<wheelsCount;i++)

    {
        updateTyre();
    }
            checkEngine();
    }
    public String getModelName(){
        return modelName; }

    public int getWheelsCount(){
        return wheelsCount;}

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public  void updateTyre(){
        System.out.println("Меняем покрышку");
    }
}
