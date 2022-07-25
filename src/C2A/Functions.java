package C2A;

public class Functions {
    public static boolean esDivisible(int num, int divisor){
        if(num % divisor == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        int num1= 4;
        int num2 = 2;
        System.out.println(Functions.esDivisible(num1, num2));
    }
}
