package chap05;

public class Exercise07 {
	public static void main(String[] args) {
		//array중에서 최대값 찾기
		int max = 0;
		int [] array = {1, 5, 3, 8, 2};
		for(int i = 0;i<array.length-1;i++) {
			if(array[i]<=array[i+1]) {
				max = array[i+1];
			}else {
				max = array[i];
			}
		}
		System.out.println("max = "+ max);
		
	}

}
