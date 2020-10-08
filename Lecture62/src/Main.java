import java.util.Scanner;
public class Main {
	//���� �Է� ���ڿ��� �ùٸ� ��ȣ���� �������� true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�Ѵ�.
	public static boolean isValid(String str) {
		//stack�� ���� �ڷḦ �ۼ��Ѵ�.
		char[] stack=new char[1024];
		int top=-1;
		
		//for ������ ���鼭 str ���ڿ��� ���ڸ� �ϳ��� �о����.
		for(int i=0; i<str.length(); i++) {
			//1. i �ε����� �ش��ϴ� ���ڸ� �д´�.
			char ch=str.charAt(i);
			//2. ��ȣ ���� ���ڶ��, ���ÿ� �ش� ���ڸ� Ǫ���Ѵ�.
			if(ch=='(') {
				//top++;
				//stack[top]=ch;
				stack[++top]=ch;
				//stack[top++]=ch; --> stack[top]=ch; top++;
			}
			//3. ��ȣ �ݱ� ���ڶ��, ���ÿ��� ���� ���� ���ڿ� ���غ���, �ùٸ��� ���� �ϳ��� ���Ѵ�.
			else if(ch==')') {
				//1. ���� ������ ��� �ִٸ�(top==-1), �� ���� ���� ��ȣ������ �ݱ� ��ȣ���� �������ٴ� �ǹ��̹Ƿ� �ùٸ��� ���� ��ȣ���� �ȴ�.
				//���ÿ� �ֻ��� ���ڰ� ���� �˻��ϴ� ���ڿ� �ٸ� �������, ���� �ùٸ��� ���� ��ȣ���� �ȴ�.
				if(top==-1 || stack[top]!='(') { //|| OR, && AND, ==EQUAL, != NOT EQUAL
					return false;
				}
				//2. ���ÿ��� �ֻ��� �������� �����Ѵ�.
				top--;
			}
		}
		//3. ������ ����ִٸ� (top==-1) true ��ȯ, �׷��� ������ false�� ��ȯ�Ѵ�.
		//if(top==-1) return true;
		//else return false;
		return top==-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String abc=scan.next();
		//���ڿ��� �ùٸ��� YES��, �ùٸ��� �ʴٸ� NO�� ����Ѵ�.
		if(isValid(abc)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
