import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);
	String firstarr= input.nextLine();
	String secondarr = input.nextLine();
	
	function(firstarr, secondarr);
		
	}
	
	public static void function(String firarr, String secarr) {
		
		int fa[] = GetNumbersFromArray(firarr);
		int sa[] = GetNumbersFromArray(secarr);
		
		int amount1 = fa.length;
		int amount2 = sa.length;
		
		for(int i =0;i<Math.max(amount1, amount2);i++) {
			if(i<Math.min(amount1, amount2)) {
				if(fa[i] == sa[i]) {
					System.out.println("+ "+fa[i]+" "+sa[i]);
				}
				else if(fa[i]!=sa[i]) {
					System.out.println("- "+fa[i]+" "+sa[i]);
				}
			}
			else {
				if(amount1>amount2) {
					System.out.println("- "+fa[i]+" "+"x");
				}
				else if(amount2>amount1) {
					System.out.println("- "+"x"+" "+sa[i]);
				}
			}
			
		}
		
	}
	
	
	
	public static int[] GetNumbersFromArray(String s) {
		
		int amountofnums = 1;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				amountofnums++;
			}
		}
		
		int nums[] = new int[amountofnums];
		int j =0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				j++;
			}
			else {
				nums[j] = nums[j]*10+(s.charAt(i)-48);
			}
		}
		
		
		
		
		return nums;
	}
		
		
	
}
