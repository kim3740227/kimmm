package chap04;

public class Exercise03_1 {
	public static void main(String[] args) {
		//1~100������ ���� �߿��� 3�� ����� ���� ���ϱ�
		int sum = 0; //sum �ʱ�ȭ
		
		for(int i=0;i<=100;i++) {
			if(i % 3 == 0) { //�������� 0�� ���� sum�� ����
				sum += i;
			}
			/*
			if(i % 3 != 0) {
				continue;
			}else {
				sum += i;
			}     // continue�̿��ؼ� if�� ����ϱ� 
			*/
		}
		System.out.println(sum);
	}

}
