package prob03;

public class Tank extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void changeMode() {
		/* 공격모드를 변환한다. */
	}
	@Override
	void move( int x, int y ) { 
		System.out.println("시즈 무브무브");
	}
	@Override
	void stop() { 
		System.out.println("땅에서 스톱");
	}	
}
