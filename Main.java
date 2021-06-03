import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        int test = Integer.parseInt(read.readLine()) ;
        while(test-- > 0) {
            int n = Integer.parseInt(read.readLine()) ;

            int[] arr = new int[n+1] ;
            arr[0] = 1 ;
            arr[1] = 1 ;
            arr[2] = 2 ;
            for(int i=3; i<=n; i++) {
                arr[i] = arr[i-3] + arr[i-2] + arr[i-1] ;
            }

            System.out.println(arr[n]);

        }
    }
}