package chap04;

public class Exercise04 {
	public static void main(String[] args) {
		//�ΰ��� �ֻ����� ���� �� (x,y)�� ���� 5�� ���� ������ ������ �����
		int x = (int)(Math.random() * 5) + 1;
		int y = (int)(Math.random() * 5) + 1;
		int z = x + y;
		
		while(z != 5) {   									//z�� 5�� �ƴϸ� 
			System.out.println("(" + x + "," + y + ")");	//(x,y)���·� ����ϰ�
			x = (int)(Math.random() * 5) + 1;					//x�� �ٽ� ���� ��
			y = (int)(Math.random() * 5) + 1;					//y�� �ٽ� ���� �� ����
			z = x + y;										//�ٽ� ���ؼ�  while�� �ݺ� 
		}
		System.out.println("(" + x + "," + y + ")");		//while���� 5�� (x,y)�� ��� �� ��
	}

}
