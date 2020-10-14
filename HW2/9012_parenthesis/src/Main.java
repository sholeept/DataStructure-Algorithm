import java.util.Scanner;
public class Main {
	public static boolean parenthesis(String str) {
		char[] stack=new char[1024];
		int top=-1;
		
		for(int i=0; i<str.length(); i++ ) {
			char ch = str.charAt(i);
			if(ch=='(') {
				stack[++top]=ch;
			}
			else if(ch==')') {
				if(top==-1 || stack[top]!='(') {
					return false;
				}
				top--;
			}
		}
		return top==-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("처리할 갯수, 문자열을 입력> ");
		int t=sc.nextInt();
		
		for(int i=0; i<t; i++) {
			String text=sc.next();
			if(parenthesis(text)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}