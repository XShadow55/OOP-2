public class Truck extends MotorTransport {

    private String modelName;
    private int wheelsCount;
    public Truck(String modelName,int wheelsCount){
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
        checkTrailer();
    }
    public String getModelName(){
        return modelName; }

    public int getWheelsCount(){
        return wheelsCount;}
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public  void updateTyre(){
        System.out.println("Меняем покрышку");
    }
}
