package project;
import java.util.Scanner;

/*선택정렬*/
class CodingTest02 {
	public static void main(String[] args) throws Exception {
		int Numbers[];
		int n, prev, next, temp;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //정렬할 숫자의 개수를 입력받는다.
		//System.out.println("디버그)정렬할 숫자의 개수는 "+n+" 개");
		Numbers = new int[n];
		
		for(int i=0; i<n; i++){
			Numbers[i] = sc.nextInt();
		}
		/* 디버그용
		System.out.print("입력받은 배열 값 확인 : ");
		for(int number:Numbers){
			System.out.print(number);
		}
		*/
		//입력받ㅇ느 배열 정렬하는 로직(아래)
		for(prev=0;prev<n-1;prev++){
			for(next=prev+1; next<n; next++){
				if(Numbers[prev]>Numbers[next]){
					temp=Numbers[prev];
					Numbers[prev]=Numbers[next];
					Numbers[next]=temp;
				}
			}
		}
		for(int number:Numbers){
			System.out.print(number+" ");
		}
	}
}
