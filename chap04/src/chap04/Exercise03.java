package chap04;

public class Exercise03 {
	public static void main(String[] args) {
		//1~100������ ���� �߿��� 3�� ����� ���� ���ϱ�
		int sum = 0; //sum �ʱ�ȭ
		
		for(int i = 0;i<=100;i=i+3) { //i=0���� 3�� Ŀ������
			sum += i;
		}
		System.out.println(sum);
	}

}
