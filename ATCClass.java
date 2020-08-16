
// 최상위 인테이스를 상속 받는 추상 클래스 ATCClass
public abstract class ATCClass implements ATCComponent {
	
	// 각 부품의 이름을 초기화
	String ComponentName = "제목 없음";
	
	// 반환	
	public String getComponentName() {
		return ComponentName;
	}
	// 각 부품의 가격을 정수형 값으로 반환하는 추상 메소드 정의
	public abstract int getCost();
}
