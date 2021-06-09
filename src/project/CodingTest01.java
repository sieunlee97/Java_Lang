package project;
    
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Main 클래스는 돈을 입력받아서 화폐 단위별로 몇 개씩 존재하는지 출력하는 기능
50000/5 -> 10000/2 -> 5000/5 -> 1000/2 -> 500/5 -> 100/2 -> 50/5 -> 10/2 -> 5/5 -> 1
*/
class CodingTest01 {
	public static void main(String[] args) throws Exception {
		int UNIT = 50000; //초기 화폐 단위
		int NUM = 0;
		int SW = 0;
		int MONEY = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		MONEY = Integer.parseInt(br.readLine());
		//System.out.println("입력한 금액은 : "+ MONEY);
		while(true){
			NUM=(int)MONEY/UNIT;
			if(NUM>0){
			System.out.println("화폐단위 "+UNIT+" 원의 개수 : "+NUM+" 개");
			}
			if(UNIT>1){
				//구현될 때 제일 끝의 화폐단위가 UNIT=1
				MONEY = MONEY-UNIT*NUM; // 1회 반복일 때 66666-50000*1 = 16666
				if(SW==0){
					UNIT=UNIT/5;
					SW=1;
				}else{
					UNIT=UNIT/2;
					SW=0;
				}
			}else{
				break;
			}
		}
	}	
}