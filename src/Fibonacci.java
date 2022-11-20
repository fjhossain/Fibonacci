public class Fibonacci {
    public static int getFibonacciNumberWithRecursion(int n) throws Exception{
        if (n < 0){
            throw new Exception("n must be a non integer!");

    } if (n == 0 || n == 1 )
    return n;
    return getFibonacciNumber( n - 2)+ getFibonacciNumber(n - 1);
    }

    
    public static int getFibonacciNumber(int n) throws Exception{
        if(n < 0){
            throw new Exception("n must be non neg integer");
        
        } if (n ==0 || n==1)
        return n;
        int[] array = new int[n + 1];
        array[0]= 0;
        array[1]=1;
        for(int i = 2; i <= n; i++){
            array[i]= array[i-1] + array[i - 2];
        } return array[n];
    }
    public static void main(String[] args) throws Exception {
        int firstArg;
        if(args.length > 0){
            try{
                firstArg = Integer.parseInt(args[0]);
                System.out.println(getFibonacciNumber(firstArg));
            }catch (NumberFormatException e){
                System.out.println("Argument" + args[0]+ "must be an integer");
                System.exit(1);
            }
        }
    }
}
