package throwskeyword1;

public class ExceptionLab {
    public static void main(String[] args) {
        try{
            ElectricCar myCar = new ElectricCar("TESLA",2,12);
            myCar.start();
        }catch (ArithmeticException a){
            System.out.println("Error throw is"+a.getMessage());
        }
        System.out.println("Program stopped");
    }
}
