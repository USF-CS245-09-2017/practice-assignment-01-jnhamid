public class Factorial {
    public int factorial(int n, String type){
        if(type.equalsIgnoreCase("Recursive")){
            return factorial_recursive(n);
        }
        else if(type.equalsIgnoreCase("Iterative")){
           return factorial_iterative(n);
        }
        return 0;
    }
    public int factorial_recursive(int n){

        if(n == 1){
            return n;
        }
        else{
         return n* factorial_recursive(n - 1);
        }


    }
    public int factorial_iterative(int n){
        int total = 1;
        if (n==0 || n==1){
            return n;
        }
        else {
            for (int i = n; i >= 1; i--) {
                total *= i;

            }
            return total;
        }

    }
}
