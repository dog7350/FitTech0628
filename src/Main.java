import java.util.*;
import member.MemberServiceImpl;
import event.EventServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberServiceImpl member = MemberServiceImpl.getInstance();
		EventServiceImpl event = EventServiceImpl.getInstance();
		
		boolean flag = true;
		
		while (flag) {
			System.out.print("\n1. 회원 관리\n2. 이벤트 관리\n3. 프로그램 종료\n명령어 입력\n>> ");
			switch (sc.nextInt()) {
				case 1 :
					System.out.print("\n회원 관리\n1. 회원 등록\n2. 회원 수 출력\n>> ");
					switch (sc.nextInt()) {
						case 1:
							
							break;
						case 2:
							
							break;
					}
					break;
				case 2 :
					System.out.print("\n이벤트 관리\n1. 이벤트 작성\n2. 이벤트 목록 출력\n>> ");
					switch (sc.nextInt()) {
						case 1:
							event.registerEvent();
							break;
						case 2:
							event.viewAllEvent();
							break;
					}
					break;
				case 3 :
					flag = false;
					System.out.println("프로그램을 종료합니다.");
					break;
			}
		}
	}
}
