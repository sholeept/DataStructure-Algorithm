import java.util.Scanner;
//public은 공개된이란 의미이며, public이 없으면, private가 자동으로 설정된다.
//자바 프로젝트에서 공개되었다는 의미는 다른 자바 파일에서 해당 클래스를 참조해서 사용할 수 있다는 의미이다.
//파일 하나당 오직 한개의 public 클래스만 허용된다.
public class Main {
	//main() 함수는 프로그램이 실행되면 가장 먼저 실행되는 함수이다.
	//여러개의 소스파일이 있어도, main() 함수는 오직 한개 존재해야 한다.
	//존재하지 않으면, 역시 실행파일이 만들어지지 않는다.
	//static은 클래스 오브젝트 없이 실행될 수 있는 함수에 붙는다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//출력은 System.out.println(...)을 사용한다.
		//println(...), print(...) 두가지 버전중 하나를 쓰는데, 전자는 줄바꿈을 처리해주고, 후자는 줄바꿈을 하지 않는다.
		System.out.println("안녕하세요.");
		System.out.print("나의 이름은 ");
		System.out.println("이승호 입니다.");
		//문자열을 처리할 때, 문자열끼리 더하기가 가능하다.
		//문자열+문자열, 문자열+숫자 등을 통해서 우리가 원하는 형태로 표시할 문자열을 만들 수 있다.
		System.out.println("학교: "+"동국대학교");
		System.out.println("연도: "+2020);
		//변수를 선언하면, 저장공간을 하나 만들고, 그 저장공간에 어떤 데이터가 들어갈 것이며 , 해당 저장공간을 어떤 이름으로 프로그램에서 사용할 것인지를 알려준다.
		//int age; 라고 선언하면, int에 필요한 공간 4바이트를 할당하고, 그 공간을 이 프로그램에서는 age라는 이름으로 대표하여 사용하게 된다.
		//변수 타입은 다양하다.
		//자바에서 기본으로 제공하는 변수 타입 중 자주 쓰이는 것들은 다음과 같다.
		//int: 4바이트 정수형
		//long: 8바이트 정수형
		//float: 8바이트 실수형
		//String: 문자열 저장하는 변수 타입
		int age;
		age=21; //age라는 이름의 저장공간에 21이라는 값을 대입한다.
		System.out.println("나이: "+age);
		//입력을 받기 위해서는 Scanner라는 자바에서 제공하는 클래스를 이용한다.
		//import java.util.Scanner; 라는 것이 앞에 지정되어야 하지만, 이클립스에서는 알아서 추가해준다.
		//입력부는 자바에서 기본제공하지 않고, 외부 모듈을 이용하는 것이고, 대부분의 자바 입력 모듈은 꽤 어렵게 프로그래밍해야 해서, 가장 간단한 모듈인 Scanner를 사용한다.
		//가장 간단하지만, 수업진행에는 큰 어려움 없고, 외부 클래스 사용은 일단 패턴으로 기억하도록 한다.
		Scanner scan=new Scanner(System.in);
		System.out.print("당신의 나이는?: ");
		age=scan.nextInt(); //키보드로부터 입력받은 숫자를 age라는 변수에 넣는다.
		System.out.println("나의 나이는 "+age+"살 입니다.");
		scan.close(); //Scanner 모듈을 닫아준다.
		//조건문 if
		//if(<조건>) ... <조건>이 참이면 ...을 실행한다.
		//if(<조건>) ..A.. else ..B.. <조건>이 참이면 ..A..를 실행하고 거짓이면 ..B..를 실행한다.
		//if(<조건1>) .A. else if(<조건2>) .B. else .C.
		//<조건1>이 참이면 .A.를 실행, <조건1>이 거짓이고 <조건2>가 참이면 .B.를 실행, <조건1>이 거짓이고 <조건2>도 거짓이면 .C.를 실행한다.
		if(age<=10) {
			System.out.println("나는 어린이 입니다.");
		}
		else if(age<=17) {
			System.out.println("나는 청소년 입니다.");
		}
		else {
			System.out.println("나는 성인 입니다.");
		}
		//자바 반복문 for 루프
		//for 루프에서 a부터 b까지 차례대로 반복하여 실행하는 것을 배운다.
		//for(int i=a; i<=b; i++) ...
		//i란 변수를 a부터 시작해서 b까지 ...을 실행한다.
		for(int i=1; i<=5; i++) {
			System.out.println("i="+i);
		}
		//중첩 for 루프
		//for 루프 실행문 안에 또 for 루프가 있는 경우, 일반적으로 i, j, k 순서대로 지정을 한다.
		for(int i=1; i<=age; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
