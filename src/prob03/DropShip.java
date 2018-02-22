package prob03;

public class DropShip extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void load() {
		/* 선택된 대상을 태운다.*/ 
	}
	
	void unload() {
		/* 선택된 대상을 내린다.*/ 
	}
	@Override
	void move( int x, int y ) { 
		System.out.println("하늘 둥둥둥");
	}
	
	void stop() { 
		System.out.println("하늘에서 둥둥둥 스톱");
	}	
}