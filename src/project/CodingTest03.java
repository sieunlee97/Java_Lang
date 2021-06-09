package project;
import java.util.Scanner;
/*버블정렬*/
class CodingTest03 {
	public static void main(String[] args) throws Exception {
		int n, bubble, idx, temp;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] Numbers = new int[n];
		
		for(int i=0;i<n;i++){
			Numbers[i] = sc.nextInt();
		}
		//중복 for문 시작
		for(bubble=0; bubble<n; bubble++){
			for(idx=0; idx<n-1; idx++){
				if(Numbers[idx]>Numbers[idx+1]){
					temp=Numbers[idx];
					Numbers[idx]=Numbers[idx+1];
					Numbers[idx+1]=temp;
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<n; i++){
			System.out.print(Numbers[i]+" ");
		}
	}
}