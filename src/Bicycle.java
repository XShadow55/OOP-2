public  class Bicycle extends WheeledTransport {

    private String modelName;
    private int wheelsCount;
    public Bicycle(String modelName,int wheelsCount){
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

    }
    public String getModelName(){
       return modelName; }

    public int getWheelsCount(){
        return wheelsCount;}
    @Override
    public  void updateTyre(){
        System.out.println("Меняем покрышку");
    }

}
