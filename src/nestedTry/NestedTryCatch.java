package nestedTry;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
               System.out.println("going to divided by 0");
               int a = 22/0;
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            try{
                int b[] = new int [10];
                b[10] = 4;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("other statement");
        }
        catch (Exception e)
        {
            System.out.println("handled the exception(outer catch");
        }
        System.out.println("Normal flow******");
    }

    }