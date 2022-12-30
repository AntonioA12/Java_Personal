package myproject_;

import java.awt.print.PrinterException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_01 {
	public static void main(String[] args) {
		// 라이브러리 호출
		Scanner sc = new Scanner(System.in);
				
		// 함수 호출 
		System.out.println("아이디 를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("패스워드 를 입력하세요.");
		String pw = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		Movie mv = new Movie(id, pw, age);
		
		//선택지 list 
		mv.movie_list.put(1, "한산-용의출현");
		mv.movie_list.put(2, "헌트");
		mv.movie_list.put(3, "불릿트레인- (청불)");
			
		mv.cinema_list.put(1, "서울지점");
		mv.cinema_list.put(2, "강남지점");
		mv.cinema_list.put(3, "역삼지점");

		mv.date_list.put(1, mv.movie_date1);
		mv.date_list.put(2, mv.movie_date2);
		mv.date_list.put(3, mv.movie_date3);
		
		mv.time_list.put(1, " 14시 35분 ");
		mv.time_list.put(2, " 17시 50분 ");
		mv.time_list.put(3, " 20시 10분 ");
		
		mv.seat_list.put(1, " G1 ");
		mv.seat_list.put(2, " G2 ");
		mv.seat_list.put(3, " G3 ");
		
		mv.people_list.put(1, " 1명 ");
		mv.people_list.put(2, " 2명 ");
		mv.people_list.put(3, " 3명 ");
		
		
	try {
		// 영화선택 
		System.out.println("당신의 나이  = " + mv.getAge());
		while( true ) {
			
			System.out.println(mv.movie_list);
			System.out.println("==== 상영할 영화를 입력하세요 ==== ");
			int num = sc.nextInt();
				
			mv.movie_select(num);
			if (num != 1 && num != 2 && num != 3 ) {
				mv.movie_select(num);				
				System.out.println("1~3번 중에서 선택해주세요.");
			} else{
				break;
			}	
		}
		// 극장선택
		while( ! mv.ticket.isEmpty() ) {
			
			System.out.println(mv.cinema_list);
			System.out.println("==== 상영관(장소)를 선택하세요 ==== ");
			int num = sc.nextInt();
				
			mv.cinema_select(num);
			if (num != 1 && num != 2 && num != 3 ) {
				mv.cinema_select(num);				
				System.out.println("1~3번 중에서 선택해주세요.");
			} else{
				break;
			}	
		}
		// 날짜선택
		while( ! mv.ticket.isEmpty() ) {
			
			System.out.println(mv.date_list);
			System.out.println("==== 날짜를 선택하세요 ==== ");
			int num = sc.nextInt();
				
			mv.date_select(num);
			if (num != 1 && num != 2 && num != 3 ) {
				mv.date_select(num);				
				System.out.println("1~3번 중에서 선택해주세요.");
			} else{
				break;
			}	
		}
		
		//시간 선택
		while(  mv.ticket.length() > 5 ) {
			
			System.out.println(mv.time_list);
			System.out.println("==== 영화 시간을 선택하세요 ==== ");
			int num = sc.nextInt();
				
			mv.time_select(num);
			if (num != 1 && num != 2 && num != 3 ) {
				mv.time_select(num);				
				System.out.println("1~3번 중에서 선택해주세요.");
			} else{
				break;
			}	
		}
		// 인원 선택
		while(  mv.ticket.length() > 5 ) {
			
			System.out.println(mv.people_list);
			System.out.println("==== 관람 인원을 선택하세요 ==== ");
			mv.people_num = sc.nextInt();
			
			mv.people_select();
			if (mv.people_num != 1 && mv.people_num != 2 && mv.people_num != 3 ) {
				mv.people_select();				
				System.out.println("1~3번 중에서 선택해주세요.");
			} else{
				break;
			}	
		}
		// 좌석선택
		while(  mv.people_num != 0 ) {
			
			System.out.println(mv.seat_list);
			System.out.println("==== 좌석을 선택하세요 ==== ");
			int num = sc.nextInt();
			mv.seat_select(num);
			
			if (num != 1 && num != 2 && num != 3 ) {
				mv.seat_select(num);				
				System.out.println("1~3번 중에서 선택해주세요.");				
			} else if (mv.seat_list.isEmpty()) {
				break;
			}
				
		}
		
	} catch(InputMismatchException e) {
		System.out.println("[ERROR] 숫자로만 입력해주세요.");
		e.printStackTrace();
	} catch ( Exception e) {
		System.out.println("[ERROR] 서비스 에러 ");
		e.printStackTrace();
	}
	
	if ( mv.ticket.length() == 13) {
		System.out.println( mv.toString());				
	}
	sc.close();
		
	}
}
