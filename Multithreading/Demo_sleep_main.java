package Multithreading;
import java.util.*;

public class Demo_sleep_main extends Thread{
	
	public static void main(String[] args) {
		
			
			try {
				for(int i=0;i<6;i++) {

				Thread.sleep(500);
				System.out.println(i);

			}
			}
			catch(Exception e) {
				
				System.out.println("exception is handled");
			}
			
		}
		
	}

