import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("N�� ���� a, b�� �����̽��ٸ� ���� ���ʴ�� �Է��ϼ���> ");
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
		System.out.println(n+"���� ���� �����Ͱ� �迭�� �����Ǿ����ϴ�.");
		System.out.println("�� �����Ϳ��� "+a+"��°���� "+b+"��° ���������� �ּڰ��� "+min+"�̰� �ִ��� "+max+"�̸� �ִ񰪰� �ּڰ��� ���� "+add+"�Դϴ�.");
		sc.close();
	}

}
