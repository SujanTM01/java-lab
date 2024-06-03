package tryCatch;

public class uncheckedException {
    public static void main(String[] args) {
        try{
            int i = 33/0;

        }catch (Exception e){
            System.out.println("error "+e.getMessage());
        }
        finally {
            System.out.println("always executed");
        }
    }
}
