public  class Bicycle extends ServiceStation {

    private String modelName;
    private int wheelsCount;
    public Bicycle(String modelName,int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName(){return modelName;}
    public int getWheelsCount(){return wheelsCount;}
    @Override
    public  void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine(){}
}
