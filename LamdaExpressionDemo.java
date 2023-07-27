package Lambda;


public class LamdaExpressionDemo {
    public static void main(String[] args) {
        //Addition
        IMathfunction add=Integer ::sum;
        //Multiplication
        IMathfunction subtract=(x,y)->x-y;
        //Division
        IMathfunction divide=(x,y)->x/y;
        System.out.println("Addition of two number is:"+add.calculate(4,3));
       System.out.println("Subtraction of two number is:"+subtract.calculate(4,3));
       System.out.println("Division of two number is:"+divide.calculate(4,2));

    }

}
@FunctionalInterface
interface IMathfunction {
    int calculate (int a,int b);

}