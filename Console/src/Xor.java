import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/sum-vs-xor
 * */

public class Xor {

	public static boolean isP(long p) {
		return (p & (p-1)) == 0;
	}
	
	public static long countBitsUnset(long n) {
		long acc = 0;
		while(n > 0) {
	          if( (n & 1) == 0)
	                acc++;
			n >>= 1;
		}
		return (long) Math.pow(2, acc);
	}
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
/*		
		for(long i=2; i<Math.pow(2, 40); i *= 2)
			System.out.printf("%d %s\n", i, isP(i));
*/
		try {
			long n = Long.parseLong(buffer.readLine());
			if(n == 0)
				System.out.println(1);
			else if(isP(n))
				System.out.println(n);
			else if(isP(n+1))
				System.out.println(0);
			else
				System.out.println(countBitsUnset(n));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
