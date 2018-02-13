package thread3;

import java.util.Scanner;

public class MainClass {
	public static void main(String []arg) {
		ThreadDemo1 thread1 = new ThreadDemo1(10, 20, "thread1", true);
		ThreadDemo1 thread2 = new ThreadDemo1(10, 20, "thread2", true);
		ThreadDemo1 thread3 = new ThreadDemo1(10, 20, "thread2", true);
		
		thread1.start();thread2.start();thread3.start();
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("choose your option....");
	
			String input = sc.nextLine();
			
			//if(input.equals("1"))thread1.getCounter();
		    if(input.equals("1"))System.out.println(thread1.getCounter());
			else if(input.equals("2"))System.out.println(thread2.getCounter());
			else if(input.equals("3"))System.out.println(thread3.getCounter());
			
			else if(input.equals("1start"))thread1.resumeThread();
			else if(input.equals("2start"))thread2.resumeThread();
			else if(input.equals("3start"))thread3.resumeThread();
			
			else if(input.equals("1stop"))thread1.stopThread();
			else if(input.equals("2stop"))thread2.stopThread();
			else if(input.equals("3stop"))thread3.stopThread();
			
			else if(input.equals("exit")) {
				thread1.stop();
				thread2.stop();
				thread3.stop();
				break;
			}
			
			
		}
		
	}

}
