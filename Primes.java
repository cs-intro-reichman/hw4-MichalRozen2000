

public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1]; 
        int counter = 0;
    
        for (int i = 2 ; i <= n ; i++){
                    arr[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i]){
            for (int j = i * 2; j <= n; j += i) {
                arr[j] = false;
            }
        }
    }
            
        
        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2 ; i <= n ; i++){
            if (arr[i]){
            System.out.println(i + " ");
            counter++;
            }
        }
        int per = (counter * 100) / n;

        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + per + "% are primes)");
      }
    }

    
  
