package project;
import java.util.Scanner;
class CodingTest05 {
	public static void main(String[] args) throws Exception {
		int[] Bin = new int[10];
		int Dec, idx=0, Mok, Nmg;
		Scanner sc = new Scanner(System.in);
		Dec = sc.nextInt();
		
		while(true){
			Mok=(int)Dec/2;
			//System.out.println(Mok);
			Nmg=Dec%2;
			//System.out.println(Nmg);
			Bin[idx]=Nmg;
            idx++;
			if(Mok==0){break;}
			Dec=Mok;

		}
		/*
        for(int i=0; i<idx; i++){
		System.out.print(Bin[i]);
		}
        */
		System.out.println();
		for(int i=idx-1; i>=0; i--){
		System.out.print(Bin[i]);
		}
	}
}