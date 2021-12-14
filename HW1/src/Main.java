import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a range, write same number twice if you want 0 - RAND_MAX \nFirst:");
		int min = 0;
		
		while(sc.hasNext()) {
			if(!sc.hasNextInt()) {
				System.out.println("Please write an integer value");
				String dummy = sc.next();
				continue;
			}
			
			min = sc.nextInt();
			break;
		}
		
		System.out.println("Second: ");
		
		int max = 0;
		
		while(sc.hasNext()) {
			if(!sc.hasNextInt()) {
				System.out.println("Please write an integer value");
				String dummy = sc.next();
				continue;
			}
			
			max = sc.nextInt();
			break;
		}
		
		
		
		GameRuler mach;
		
		if(max == min) {
			mach = new GameRuler();
		}
		else {
			mach = new GameRuler(min, max);
		}
		
		mach.play();
	}
	
}
