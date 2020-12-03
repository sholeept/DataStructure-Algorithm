import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("랜덤 데이터 개수 N과 구간의 개수 K를 차례대로 입력하세요(N K)> ");
		long start=System.currentTimeMillis();
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] data=new int[n];
		int[] a=new int[k];
		int[] b=new int[k];
		
		for(int i=0; i<n; i++) {
			data[i]=rand.nextInt();
			a[i]=rand.nextInt(n)+1;
			b[i]=rand.nextInt(n)+1;
			if(a[i]>b[i]) {
				int change=a[i];
				a[i]=b[i];
				b[i]=change;
			}
			int max=data[i];
			int min=data[i];
			for(int j=a[i]; j<=b[i]; j++) {
				if(data[j]>max) {
					max=data[j];
				}
				else if(data[j]<min) {
					min=data[j];
				}
			}
		}
		
		long end=System.currentTimeMillis();
		System.out.println(n+"개의 랜덤 데이터와 "+k+"개의 랜덤 구간이 생성되었습니다.");
		//System.out.println("이 데이터에서 "+a+"번째부터 "+b+"번째 구간까지의 최솟값은 "+min+"이고 최댓값은 "+max+"이며 최댓값과 최솟값의 합은 "+(max+min)+"입니다.");
		System.out.println("알고리즘 구동에 소요된 시간: "+(end-start));
		sc.close();
	}

}
