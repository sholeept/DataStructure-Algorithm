import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random(1000);
		System.out.print("Insert n> ");
		int n=scan.nextInt();
		int[] v=new int[n];
		for(int i=0; i<n; i++) {
			v[i]=rand.nextInt();
		}
		System.out.print("Insert a> ");
		int a=scan.nextInt();
		System.out.print("Insert b> ");
		int b=scan.nextInt();
		
		int[] r=new int[b-a+1];
		for(int i=0; i<b-a+1; i++) {
			r[i]=v[i+a];
		}
		Arrays.sort(r);
		int min=r[0];
		int max=r[b-a];
		int sum=0;
		for(int i=0; i<b-a+1; i++) {
			sum+=r[i];
		}
		System.out.println("min: "+min+", max: "+max+", sum: "+sum);
	}

}
