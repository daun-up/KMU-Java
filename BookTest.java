package homework1004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book {
	public String title;
	public int score;
	
	public Book(String title,int score) {
		super();
		this.title = title ;
		this.score = score ;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return ("Book[title="+title+","+"score="+score+"]");
	}
	
}

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookshelf = new ArrayList<Book>();
		System.out.println("===================================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("====================================");
		loop:
			while(true) {
				System.out.print("메뉴를 선택하시오 :");
				int num = sc.nextInt();
				sc.nextLine(); //두 글자 이상의 제목 입력 받기
				
				switch(num) {
				case 1 : System.out.print("책 제목:");
				String title = sc.nextLine();
				
				System.out.print("책 평점:");
				int score = sc.nextInt();
				
				Book book = new Book(title,score);
				bookshelf.add(book);
				break;
				
				case 2 : System.out.print("책 검색:");
				String word = sc.next();
				for(int i = 0; i < bookshelf.size(); i++) {
					String t = bookshelf.get(i).getTitle();
					int idx = t.indexOf(word);
					if(idx==-1)
						continue;
					else {System.out.println(bookshelf.get(i));}

				}
				
				
				
				
				break;
				
				case 3 : 
				Iterator<Book> iterator=bookshelf.iterator();
				int count = bookshelf.toArray().length;
				System.out.println("등록된 책 개수 :"+count);
				while(iterator.hasNext()) {
					Book str = iterator.next();
					System.out.println(str);
				}
				
				break;
				case 4 : System.out.println("종료");
				break loop;
				
				}
			}
	}
}
				
			
		
		