package BAM_spring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 실행==");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("명령어 ) ");
		
		String cmd = sc.nextLine();
		
		if(cmd.equals("article write")) {
			System.out.println("게시물 작성");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
