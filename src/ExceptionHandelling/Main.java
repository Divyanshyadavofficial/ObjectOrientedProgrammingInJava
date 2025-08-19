package ExceptionHandelling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            //divide(a,b);
//            mimicing
            String name = "kunal";
            if(name.equals("kunal")) {
                throw new MyException("name is kunal");
            }
//            the more strict exceptions that you have
//            you have to add them first.
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always run");
        }
    }

    static int divide(int a , int b)throws ArithmeticException{
        if(b==0){
//          here we are explicitly throwing a exception
            throw new  ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
