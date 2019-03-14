package chap05;

public class MainSringArrayArgument_05 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
//매개값이 없어서 0으로 if문이 실행됨
//run - run configurations - MainjStringArrayArgument - program arguments에 값 두개 써야 if가 false가 됨