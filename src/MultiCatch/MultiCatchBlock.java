package MultiCatch;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            int a = 4;
            int b = 0;
            int c = a/b;
        } catch (ArithmeticException e){
            System.out.println("ArithemeticException"+e.getLocalizedMessage());
        }
        catch (Exception e){
            System.out.println("Exception"+e.getLocalizedMessage());
        }
        finally {
            System.out.println("Always Executed");
        }
    }
}
