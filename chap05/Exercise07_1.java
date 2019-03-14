package chap05;

public class Exercise07_1 {
	public static void main(String[] args) {
		//주어진 배열 안에서 최대값구하기
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
//while문 안의 값이 false가 되는 순간 while문이 안돌아감...
