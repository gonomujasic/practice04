package prob03;

public class Marine extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}	
	@Override
	void move( int x, int y ) { 
		System.out.println("땅개 고고");
	}
	@Override
	void stop() { 
		System.out.println("땅개 스톱");
	}	
}
