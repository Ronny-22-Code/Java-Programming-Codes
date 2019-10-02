package Practice_Codes;

import java.util.*;


public class PC_1 {


	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int l=0,i;
				
				String s = sc.next();

				l = s.length();
				
				StringBuilder sb = new StringBuilder(s); 
			
				int j=0;
				
				for(i=0;i<l-1;i++){

					if(s.charAt(i)==s.charAt(i+1)){

						sb.replace(j,j+1,"");
					}
					
					else {
						
						j++;
					}

				}
			
			System.out.println(sb.toString());
			
			
		}

	
	
	
	
	
	}
