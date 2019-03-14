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
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int selectNum = scanner.nextInt(); //숫자 입력받음
			
			if(selectNum == 1) {			//1을 선택했을 때
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();  //학생 수 입력받음
			}else if(selectNum == 2) {			//2를 선택했을 때
				for(int i = 0;i<studentNum;i++) {
					System.out.print("scores[" + i + "]:");
					scores = new int[studentNum];	//배열에 새로운 학생 수만큼 자리 만듬
					scores[i] = scanner.nextInt(); 	//학생수만큼 점수 입력
				}
			}else if(selectNum == 3) {				//3선택했을 때
				for(int i = 0;i<studentNum;i++) {	//입력받은 값이 출력값으로 나오도록 만듬
					System.out.println("scores[" + i + "]:" + scores[i]); //??왜 마지막꺼만 값이 나오고 나머지는 0으로 나올까?????
				}
			}else if(selectNum == 4) {					//?????Exception in thread "main"?????
				for(int i = 0;i<scores.length;i++) {	//배열의 길이만큼 인덱스를 차례로 바꿈
					if(scores[i] <= scores[i+1]) {		//0인덱스부터 차례로 뭐가 더 큰지 비교
						max = scores[i+1];				//더 큰값을 맥스에 저장 	
					}
					sum += scores[i];				//sum에 배열 값을 계속 더함
					System.out.println(max);
					avg = (double)sum / studentNum;    
					System.out.println(avg);
				}
			}else if(selectNum == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
