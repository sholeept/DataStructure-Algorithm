import java.util.Scanner; //Scanner Ŭ���� ����� ���ؼ� �߰� �ʿ�.
public class Main {
	//1���� n���� ���� ���ϴ� �Լ��̴�.
	static long sum(int n) {
		long s=0;
		for(int i=1; i<=n; i++) {
			s+=i; //s=s+1;
		}
		return s;
	}
	static long sum1(long n) {
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner Ŭ���� ������Ʈ�� �ϳ� �����Ѵ�.
		Scanner scan=new Scanner(System.in);
		
		//�Է� ���ð��� �ð��� �帣�� ������ ������ ��Ȯ���� ���ؼ� �Է��� �����ϴ� �� �ۿ��� ó���Ѵ�.
		System.out.print("n�� �Է��ϼ���: ");
		int n=scan.nextInt();
		
		//System.currentTimeMillis() �Լ��� ���� �ð��� ms������ �����ش�.
		//Ư����¥, �ð��� 0���� �ؼ�, ������ ���� �����ش�.
		System.out.println("Current time is "+System.currentTimeMillis());
		//Ư���۾��� ����ð��� �����ϱ� ���ؼ� Ư���۾� �������� �ð��� ����ؼ� start ������ �����Ѵ�.
		long start=System.currentTimeMillis();
		
		//�̰����� Ư�� �۾��� �Ѵ�.
		System.out.println("Sum from 1 to "+n+" is "+sum(n));
		
		//Ư���۾��� ������ ���� �ð��� end�� �����Ѵ�.
		long end=System.currentTimeMillis();
		
		//��� �ð��� (end-start)ms�� �ȴ�.
		System.out.println("Elapsed time is "+(end-start)+"ms");
	}

}
