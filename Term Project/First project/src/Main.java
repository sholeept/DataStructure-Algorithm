import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("N과 구간 a, b를 스페이스바를 통해 차례대로 입력하세요> ");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] data=new int[n];
		int max=data[a-1];
		int min=data[a-1];
		for(int i=0; i<n; i++) {
			data[i]=rand.nextInt();
		}
		for(int i=a-1; i<=b-1; i++) {
			if(data[i]>max) {
				max=data[i];
			}
			else if(data[i]<min) {
				min=data[i];
			}
		}
		int add=max+min;
		System.out.println(n+"개의 랜덤 데이터가 배열로 생성되었습니다.");
		System.out.println("이 데이터에서 "+a+"번째부터 "+b+"번째 구간까지의 최솟값은 "+min+"이고 최댓값은 "+max+"이며 최댓값과 최솟값의 합은 "+add+"입니다.");
		sc.close();
	}

}
