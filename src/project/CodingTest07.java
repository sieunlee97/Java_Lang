package project;

import java.util.Scanner;
class CodingTest07 {
	public static void main(String[] args) throws Exception {
		int n=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int Score[] = new int[n];
		int Rank[] = new int[n];
		for(int i=0; i<n; i++){
			Score[i]=sc.nextInt();
			Rank[i]=0;
		}
		for(int i=0; i<n; i++){
			for(int comp=0; comp<n; comp++){
				if(Score[i]<Score[comp]){
					Rank[i] = Rank[i]+1;
				}
			}
			Rank[i]=Rank[i]+1;
		}
		for(int i=0; i<n; i++){
			System.out.println((i+1)+"번째 학생의 점수는 "+Score[i]+"이고, 등수는 "+Rank[i]);
		}
		
	}
}