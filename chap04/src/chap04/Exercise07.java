package chap04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			
			String inputString = scanner.nextLine();
			if(inputString.equals("1")) {
				System.out.print("���ݾ�> ");
				String inputString1 = scanner.nextLine();
			}else if(inputString.equals("2")) {
				System.out.print("��ݾ�> ");
				String inputString2 = scanner.nextLine();
			}else if(inputString.equals("3")) {
				System.out.print("�ܰ�> ");
				int money = balance + (int)inputString1 - (int)inputString2; //balance + ���ݾ�  - ��ݾ��� ���ǵ���
				System.out.println(money);
				
			}else if(inputString.equals("4")){
				System.out.println("");
				System.out.println("���α׷� ����");
				break;
			}
		}	
	}

}
