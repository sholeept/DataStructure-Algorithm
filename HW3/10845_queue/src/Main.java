import java.util.Scanner;
class Queue<E> {
	int front;
	int rear;
	E[] data;
	int size;
	Queue() {
		front=rear=-1;
		size=1000;
		data=(E[]) new Object[size];
	}
	public void add(E v) {
		data[rear]=v;
		rear=(rear+1)%size;
	}
	public void remove() {
		data[front]=null;
		front=(front+1)%size;
	}
	public E peek() {
		return data[front];
	}
	public int empty() {
		for(int i=0; i<size; i++) {
			if(data[i]==null) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	public int size() {
		return(rear-front+size)%size;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new Queue();
		System.out.print("> ");
		int num=sc.nextInt();
		int result=0;
		for(int i=0; i<num; i++) {
			System.out.print("> ");
			String input=sc.next();
			if(input=="pop") {
				q.remove();
			}
			else if(input=="size") {
				result=q.size();
			}
			else if(input=="empty") {
				result=q.empty();
			}
			else if(input=="front") {
				result=q.front;
			}
			else if(input=="back") {
				result=q.rear;
			}
			else if(input=="push") {
				System.out.print("Ǫ���� ������ �Է��ϼ���> ");
				int n=sc.nextInt();
				q.add(n);
				i--;
			}
			else {
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				i--;
			}
			System.out.println(result);
		}
		sc.close();

	}

}
