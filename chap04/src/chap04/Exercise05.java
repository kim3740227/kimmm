package chap04;

public class Exercise05 {
	public static void main(String[] args) {
		//x,y <= 10�̸鼭 4x + 5y = 60�� �Ǵ� (x,y)���ϱ�
		int sum;
		
		for(int x = 1;x<=10;x++) {
			for(int y = 1;y<=10;y++) {
				sum = (4 * x) + (5 * y);
				if(sum == 60) {
					System.out.println("(" + x + "," + y + ")");
					continue;
				}
				
			}
		}
	}
}
