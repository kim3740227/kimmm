package chap05;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int  max = 0;
		int sum = 0;
		double avg = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л��� |2.�����Է� |3.��������Ʈ |4.�м� |5.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			
			int selectNum = scanner.nextInt(); //���� �Է¹���
			
			if(selectNum == 1) {			//1�� �������� ��
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();  //�л� �� �Է¹���
			}else if(selectNum == 2) {			//2�� �������� ��
				for(int i = 0;i<studentNum;i++) {
					System.out.print("scores[" + i + "]:");
					scores = new int[studentNum];	//�迭�� ���ο� �л� ����ŭ �ڸ� ����
					scores[i] = scanner.nextInt(); 	//�л�����ŭ ���� �Է�
				}
			}else if(selectNum == 3) {				//3�������� ��
				for(int i = 0;i<studentNum;i++) {	//�Է¹��� ���� ��°����� �������� ����
					System.out.println("scores[" + i + "]:" + scores[i]); //??�� ���������� ���� ������ �������� 0���� ���ñ�?????
				}
			}else if(selectNum == 4) {					//?????Exception in thread "main"?????
				for(int i = 0;i<scores.length;i++) {	//�迭�� ���̸�ŭ �ε����� ���ʷ� �ٲ�
					if(scores[i] <= scores[i+1]) {		//0�ε������� ���ʷ� ���� �� ū�� ��
						max = scores[i+1];				//�� ū���� �ƽ��� ���� 	
					}
					sum += scores[i];				//sum�� �迭 ���� ��� ����
					System.out.println(max);
					avg = (double)sum / studentNum;    
					System.out.println(avg);
				}
			}else if(selectNum == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
