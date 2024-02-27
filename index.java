public class index {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int array[] = new int[5];
        String str = null;
       
        try {
            j = 20/i;
            System.out.println(j);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
        try {
            System.out.println(array[2]);
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Stay within the array limit");
        }
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
        
        System.out.println("Execution continues");
    }
}