package chap05;

public class Exercise07_1 {
	public static void main(String[] args) {
		//�־��� �迭 �ȿ��� �ִ밪���ϱ�
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		int i = 0;
		
		while(array[i]<=array[i+1]) {
			max = array[i+1];
			i += 1;
			continue;
		}System.out.println(max);
	}

}
//while�� ���� ���� false�� �Ǵ� ���� while���� �ȵ��ư�...
