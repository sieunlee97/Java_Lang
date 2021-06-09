package project;
import java.util.Scanner;
class CodingTest06 {
	
	static long Factorial = 1;
	public static void main(String[] args) throws Exception {
		int n;
		long Result;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		Result=fact(n);
		System.out.println(n+"팩토리얼 = "+Result);
	}
	public static long fact(int n){
		if(n==1){
			return Factorial;
		} else {
			Factorial = Factorial * n;
			n=n-1;
			return fact(n);
		}
	}
}