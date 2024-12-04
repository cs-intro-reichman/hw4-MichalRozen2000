

public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1]; 
        int p = 2;
        for (int i = 2 ; i <=n ; i++){
                    arr[i] = true;
        }
        while (p*p <= n){
            if (arr[p]){
                for (int i = p * p ; i <= n ; i += p){
                    arr[i] = false;
                }
            }
            p++;
        }
            
        
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for (int i = 2 ; i <= n ; i++){
            if (arr[i]){
            System.out.println(i + " ");
            counter++;
            }
        }
        int per = (counter / 100) * n;
        System.out.println("There are " + counter + "between 2 and " + n + "(" + per + "% are primes)");
      }
    }
    
  
