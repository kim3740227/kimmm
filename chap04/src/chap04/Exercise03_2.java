package chap04;

public class Exercise03_2 {
	public static void main(String[] args) {
		//1~100������ ���� �߿��� 3�� ����� ���� ���ϱ�
		int sum = 0;
		int i = 1;
		
		while(i <= 100) { //i�� �麸�� �۰ų� ����
			while(i % 3 == 0){ //i�� 3���� ���� �������� 0�� ��
				sum += i; //sum�� i�� ����
				break;
			}
			i++; //i�� 3���� ���� �������� 0�� �ƴϿ��� i�� 100���ٸ� ������ i+1
		}
		System.out.println(sum);
	}

}
