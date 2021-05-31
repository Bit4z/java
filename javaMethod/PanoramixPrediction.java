import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PanoramixPrediction {
    private static int nextPrime(int n) {
        int r=0;
        if (n <= 50) {
            r = n + 1;
            while (isprime(r) != true) r += 1;
        }
        return r;
    }
    private static boolean isprime(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % 2 == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().trim().split(" ");
        int n1 = Integer.parseInt(s1[0]);
        int n2 = Integer.parseInt(s1[1]);

        if (isprime(n2) == true) {
            if(nextPrime(n1)==n2) System.out.println("YES");
            else System.out.println("NO");
        }
        else System.out.println("NO");

        br.close();
    }
}