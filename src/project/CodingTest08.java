package project;

import java.util.Scanner;
class CodingTest08 {
	public static void main(String[] args) throws Exception {
		int n=0;
		int MaxCnt=0, Top=0;
		int Max=0; 
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); //투표하는 사람 수
		int Vote[] = new int[n]; //투표한 번호 저장하는 배열
		for(int i=0; i<n; i++){
			Vote[i]=sc.nextInt();
			if(Vote[i] > Max){ //배열 입력 값 중 최고 높은 값을 구하는 로직/ Max= Vote 배열에서 가장 큰 번호
				Max=Vote[i]; 
			}
		}
		int Index[] = new int[Max+1];
		for(int i=0; i<n; i++){
			Index[Vote[i]] = Index[Vote[i]]+1; // 선택받은 번호(후보)의 개수를 ++하여 Index배열에 저장
            // Vote[0]=1, Vote[1]=2, Vote[2]=2
            // Index[Vote[0]]=Index[1]=index[1]+1 => 0+1=1
            // Index[Vote[1]]=Index[2]=index[2]+1 => 0+1=1
            // Index[Vote[2]]=Index[2]=index[2]+1 => 1+1=2
            // 따라서, Index 배열에 저장되는 값은 후보들의 투표 수
		}
		for(int i=0; i<Max+1; i++){
			if(Index[i]>MaxCnt){// 후보들의 득표수가 MaxCnt보다 크다면, 
				MaxCnt=Index[i]; // MaxCnt에 득표 수 저장.
				Top=i; //MaxCnt를 갖는 후보 번호인 i를 Top에 저장
			}
		}
		System.out.println("최다 선택 값 : "+Top+", 선택표 수 : "+MaxCnt);
	}
}