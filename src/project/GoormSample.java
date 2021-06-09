package project; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Arrays;

class GoormSample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// 난이도의 문제 받기
		int[] questions = new int[N];
		String str = br.readLine();
		String[] split = str.split(" ");
		for(int i = 0; i < N; ++i){
			questions[i] = Integer.parseInt(split[i]);
		}
		
		
		for(int q:questions){
			System.out.print(q);
		}
		System.out.println();
        //Arrays.sort(questions);
        //직접 만든 오름차순 메서드 사용
		UserArrays userArrays = new UserArrays();
		userArrays.sort(questions);
		for(int q:questions){
			System.out.print(q);
		}
		System.out.println();
		
		
		int count = 1;
		int before = questions[0];
		for(int i : questions){
			if(before != i)
				count++;
			else if (count == 3)
				break;
			before = i;
		}
		if(count < 3)
			System.out.print("NO");
		else
			System.out.print("YES");

		br.close();
	}
}

//직접 만든 오름차순 메서드
class UserArrays {
		//static 으로 만들면 실행가능한 메서드
		//static 으로 안하면 객체 생성 후 이용 가능
		public int[] sort(int[] Numbers) throws Exception {
		int n, prev, next, temp;
			
		n = Numbers.length;
			
		//입력받은 배열 정렬하는 로직(아래)
		for(prev=0;prev<n-1;prev++){
			for(next=prev+1; next<n; next++){
				if(Numbers[prev]>Numbers[next]){
					temp=Numbers[prev];
					Numbers[prev]=Numbers[next];
					Numbers[next]=temp;
				}
			}
		}
		//정렬된 결과 리턴
			return Numbers;
	}
}