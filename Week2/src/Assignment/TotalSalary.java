package Assignment;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int BasicSal= s.nextInt();
		char grade= s.next().charAt(0);
		float hra= 0.2f*BasicSal;
		float da= 0.5f*BasicSal;
		float pf= 0.11f*BasicSal;
		float Totalsal= (BasicSal+ hra+ da- pf);
		if(grade=='A') {
			Totalsal= Totalsal+1700;
		}
		else if(grade=='B') {
			Totalsal= Totalsal+1500;
		}
		else {
			Totalsal= Totalsal+1300;
		}
		int roundedValue = Math.round(Totalsal);
		System.out.print(roundedValue);
		
		

	}

}
