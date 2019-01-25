public class Fibonacci {
    public int total;
    public int fibonacci(int n, String type){
        if(type.equalsIgnoreCase("recursive")){

            return fibonacci_recursive(n);
        }
        else if(type.equalsIgnoreCase("iterative")){

            return fibonacci_iterative(n);

        }

        else{
            return 0;
        }

    }
    public int fibonacci_iterative(int n){
        if(n <= 1) {
            return n;
        }
        int n2 = 1;
        int n1 = 1;

        for(int i=2; i<n; i++) {
            int n3 = n2;
            n2+= n1;
            n1 = n3;
        }
        return n2;
    }

    public int fibonacci_recursive(int n){
        if(n == 0 || n ==1){
            return n;
        }
        this.total = fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        return this.total;

    }
}
