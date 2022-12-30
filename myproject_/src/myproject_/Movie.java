package myproject_;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Movie {
	
	// 회원정보 
	private String ID ;
	private String PW ;
	private int age ; 
	
	// 예매 티켓 번호
	public String ticket = "";
	public String seat = "선택한 좌석은 = ";
	public int people_num ; 

	// 사용자 선택지 목록 
	public Map<Integer, String> movie_list = new HashMap<>();
	public Map<Integer, String> cinema_list = new HashMap<>();
	public Map<Integer, LocalDate> date_list = new HashMap<>();
	public Map<Integer, String > time_list = new HashMap<>();
	public Map<Integer, String> people_list = new HashMap<>();
	public Map<Integer, String> seat_list = new HashMap<>();
	
	public LocalDate currentDate = LocalDate.now();
	public LocalDate movie_date1 = LocalDate.of(2022, 8, 30);
	public LocalDate movie_date2 = LocalDate.of(2022, 9, 3);
	public LocalDate movie_date3 = LocalDate.of(2022, 9, 4);
	
	// 생성자 
	public Movie(String iD, String pW, int age) {
		super();
		ID = iD;
		PW = pW;
		this.age = age;
	}


	//영화선택
	public void movie_select(int num) {
		
		if (num == 1) {
			System.out.println(movie_list.get(1) + " 선택 완료");
			this.ticket = this.ticket + "11";	
			} else if (num == 2) {
				if ( age <15) {
					System.out.println("15세 미만 관람 금지입니다.");
				} else {
					System.out.println(movie_list.get(2) + " 선택 완료");
					this.ticket = this.ticket + "12";
				}
			} else if ( num == 3 ) {
				if(age < 20) {
					System.out.println("청소년 관람 불가입니다. ");
			} 	else {
				System.out.println(movie_list.get(3) + " 선택 완료");
				this.ticket = this.ticket + "13";	
			}
		}	
	}
	// 극장선택 
	public void cinema_select(int num) {
		
		if (num == 1) {
			System.out.println(cinema_list.get(1) + " 선택 완료");
			this.ticket = this.ticket + "76";	
			} else if (num == 2) {
			System.out.println(cinema_list.get(2) + " 선택 완료");
			this.ticket = this.ticket + "63";
			} else if ( num == 3 ) {
				System.out.println(cinema_list.get(3) + " 선택 완료");
				this.ticket = this.ticket + "24";	
			}
	} 			

	//  날짜선택 
	public void date_select(int num) {
		
		if (num == 1) {
			if(movie_date1.isBefore(currentDate)) {
				System.out.println(" 상영 종료된 영화입니다.");
			} else {
				System.out.println(date_list.get(1) + " 선택 완료");
				this.ticket = this.ticket + "0902";		
			}
			
		} else if (num == 2) {
			if(movie_date2.isBefore(currentDate)) {
				System.out.println(" 상영 종료된 영화입니다.");		
			} else {
				System.out.println(date_list.get(2) + " 선택 완료");
				this.ticket = this.ticket + "0903";				
			}
		} else if ( num == 3 ) {
			if(movie_date3.isBefore(currentDate)) {
				System.out.println(" 상영 종료된 영화입니다.");
				
			} else {
				System.out.println(date_list.get(3) + " 선택 완료");
				this.ticket = this.ticket + "0904";					
			}
		}
	} 		
	
	// 시간선택 
	public void time_select(int num) {
		if (num == 1) {
			System.out.println(time_list.get(1) + " 선택 완료");
			this.ticket = this.ticket + "1020";	
			} else if (num == 2) {
			System.out.println(time_list.get(2) + " 선택 완료");
			this.ticket = this.ticket + "1135";
			} else if ( num == 3 ) {
				System.out.println(time_list.get(3) + " 선택 완료");
				this.ticket = this.ticket + "1435";	
			}
	} 		
	
	// 인원 수 선택
	public void people_select() {
		if (people_num == 1) {
			System.out.println(people_list.get(1) + " 선택 완료");
			this.ticket = "S" + this.ticket ;	
			} else if (people_num == 2) {
			System.out.println(people_list.get(2) + " 선택 완료");
			this.ticket = "C" + this.ticket ;
			} else if ( people_num == 3 ) {
				System.out.println(people_list.get(3) + " 선택 완료");
				this.ticket = "F" + this.ticket ;	
			}
	} 	
	
	// 좌석 선택 
	public void seat_select(int num) {
		if (num == 1) {
			System.out.println(seat_list.get(1) + " 선택 완료");
			this.seat += seat_list.get(1);
			seat_list.remove(1);
			this.people_num --;
			
		} else if (num == 2) {
			System.out.println(seat_list.get(2) + " 선택 완료");
			this.seat += seat_list.get(2);
			seat_list.remove(2);
			this.people_num --;
			
		} else if ( num == 3 ) {
			System.out.println(seat_list.get(3) + " 선택 완료");
			this.seat += seat_list.get(3);
			seat_list.remove(3);
			this.people_num --;
		}
	} 		

	
	
	


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPW() {
		return PW;
	}


	public void setPW(String pW) {
		PW = pW;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Movie [ 당신의 예매티켓 번호는 = " + ticket + " " 
	+ seat + "] 입니다.";
	}
	
	
}
