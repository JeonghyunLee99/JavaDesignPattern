
public class MetalATCBody extends ComponentDecorator {
	
	// ATCClass 클래스의 인스턴스 변수
	ATCClass aTCClass;
	
	// ATCComponent 클래스 형태의 인스턴스 변수 toycar를 매개변수를 받아서 기본 생성자를 이용해 초기화합니다.
	public MetalATCBody(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	// 각 부품의 이름을 반환하는 메소드
	public String getComponentName() {
		return toycar.getComponentName() + ", 메탈 차체";
	}
	
	// 각 부품의 가격을 반환하는 메소드
	public int getCost() {
		return 3000 + toycar.getCost();
	}
	
}
