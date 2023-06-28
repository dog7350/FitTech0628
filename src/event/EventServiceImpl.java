package event;

import java.util.ArrayList;
import java.util.Scanner;

public class EventServiceImpl implements EventService {
	
	ArrayList<String> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void registerEvent() { //이벤트 이름 등록
		System.out.println("등록할 이벤트 이름");
		System.out.println(">>>");
		String eventName = sc.next();
		list.add(eventName);
	}
	
	public void viewAllEvent() {
		System.out.println("모든 이벤트 보기 실행");
		System.out.println(">>>");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public void viewEvent() {
		System.out.println("이달의 이벤트 보기 실행");
	}
}
