import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("���� ������ ���� N�� ������ ���� K�� ���ʴ�� �Է��ϼ���(N K)> ");
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
		System.out.println(n+"���� ���� �����Ϳ� "+k+"���� ���� ������ �����Ǿ����ϴ�.");
		//System.out.println("�� �����Ϳ��� "+a+"��°���� "+b+"��° ���������� �ּڰ��� "+min+"�̰� �ִ��� "+max+"�̸� �ִ񰪰� �ּڰ��� ���� "+(max+min)+"�Դϴ�.");
		System.out.println("�˰��� ������ �ҿ�� �ð�: "+(end-start));
		sc.close();
	}

}
