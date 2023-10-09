public class Truck extends ServiceStation {

    private String modelName;
    private int wheelsCount;
    public Truck(String modelName,int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName(){return modelName;}
    public int getWheelsCount(){return wheelsCount;}
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
