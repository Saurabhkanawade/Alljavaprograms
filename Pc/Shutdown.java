package Pc;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class Shutdown {

	public static void main(String[] args) throws IOException {

		Scanner s=new Scanner(System.in);
		
		double time=s.nextDouble();
		
		Runtime runtime=Runtime.getRuntime();
       	Process p=runtime.exec("Shutdown -s -t"+time);
		
		System.exit(1);
		
		
	}

}
