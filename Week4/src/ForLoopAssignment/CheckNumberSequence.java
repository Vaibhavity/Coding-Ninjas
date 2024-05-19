package ForLoopAssignment;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int prev=s.nextInt();
		boolean decreasing=true;
		boolean strict=true;
		for(int i=1;i<=n-1;i++)
		{
			int curr= s.nextInt();
			if (decreasing) {
				if(curr>prev) {
					decreasing=false;
					strict=false;
				}
				else if(curr==prev) {
					System.out.print(false);
					strict=false;
					break;
				}
				else {
					strict=true;
				}
			}
			else if(decreasing==false) 
			{
				if(curr<prev) {
					System.out.print(false);
					strict=false;
					break;
				}
				else if(curr==prev) {
					System.out.print(false);
					strict=false;
					break;
				}
				else {
					strict=true;
				}
			}
			prev=curr;
		}
		if (strict)
		{
		System.out.print(true);
		}
		}


	}


