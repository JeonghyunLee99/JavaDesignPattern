// Design pattern(박제호 교수님) 15주차 기말평가, Date: 2020-06-22(월), Writer: 이정현(소프트웨어학과 32193469)

public class dd202001DPFinalMain32193469 {

	private static void test_part1() {
		/////////
		System.out.println("=== Part1 ===");
		ATCComponent toycar1 = new Plastic();
		toycar1 = new PlasticATCFrame(toycar1);
		toycar1 = new PlasticATCBody(toycar1);
		toycar1 = new PlasticATCPaint(toycar1);
		System.out.println("Plastic car's cost is " + toycar1.getCost() + " won");
		// 플래스틱 프레임을 결정하고 조립을 시작한다.
		// 플래스틱 차체를 결정하고 조립을 진행한다.
		// 플래스틱용 페인트를 결정하고 조립을 완료한다.
		// 전체 가격을 계산하고 출력한다. 
		System.out.println(""); 
		ATCComponent toycar2 = new Metal();
		toycar2 = new MetalATCFrame(toycar2);
		toycar2 = new MetalATCBody(toycar2);
		toycar2 = new MetalATCPaint(toycar2);
		System.out.println("Metal car's cost is " + toycar2.getCost() + " won");
		// 메탈 프레임을 결정하고 조립을 시작한다.
		// 메탈 차체를 결정하고 조립을 진행한다.
		// 메탈 페인트를 결정하고 조립을 완료한다.
		// 전체 가격을 계산하고 출력한다.
	}
	
	private static void test_part2() {
		/////////
		System.out.println("\n=== Part2 ===");
		// "PTC Store" 라는 이름으로 플래스틱 장난감 가게를 오픈한다.
		// "MTC Store" 라는 이름으로 메탈 장난감 가게를 오픈한다.
		// "HTC Store" 라는 이름으로 혼합형 장난감 가게를 오픈한다.
		// "PTC Store"를 이용하는 "plastic_client1"을 만든다
		// "MTC Store"를 이용하는 "plastic_client2"을 만든다
		// "HTC Store"를 이용하는 "plastic_client3"을 만든다
		// 각 소비자는 자신이 이용하는 스토어에 sports/SUV 형 장난감을 각기 주문한다.
	}
	
	private static void test_part3() {
		/////////
		System.out.println("\n=== Part3 ===");
		// "PTC Store" 형 스토어 생성
		// "PTC Store" 형 스토어를 이용하는 소비자를 세 명 생성
		// 세 명의 소비자가 소식지 구독을 신청
		// 소식지를 발행
		// 세명의 소비자를 구독 리스트에서 제거
		// 소식지를 발행

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_part1();
		test_part2();
		test_part3();
	}

}
