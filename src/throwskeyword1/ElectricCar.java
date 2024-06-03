package throwskeyword1;

class ElectricCar {
    String modelName;
    int batteryLevel;
    int batteryID;
    ElectricCar(String modelName,int batteryLevel,int batteryID){
        this.batteryID = batteryID;
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
    }
    public void start(){
        if (this.batteryLevel<=0){
            throw new ArithmeticException("low battery level");
        }
        System.out.println("Start of El Car");
    }

}
