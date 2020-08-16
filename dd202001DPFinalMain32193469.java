// Design pattern(����ȣ ������) 15���� �⸻��, Date: 2020-06-22(��), Writer: ������(����Ʈ�����а� 32193469)

public class dd202001DPFinalMain32193469 {

	private static void test_part1() {
		/////////
		System.out.println("=== Part1 ===");
		ATCComponent toycar1 = new Plastic();
		toycar1 = new PlasticATCFrame(toycar1);
		toycar1 = new PlasticATCBody(toycar1);
		toycar1 = new PlasticATCPaint(toycar1);
		System.out.println("Plastic car's cost is " + toycar1.getCost() + " won");
		// �÷���ƽ �������� �����ϰ� ������ �����Ѵ�.
		// �÷���ƽ ��ü�� �����ϰ� ������ �����Ѵ�.
		// �÷���ƽ�� ����Ʈ�� �����ϰ� ������ �Ϸ��Ѵ�.
		// ��ü ������ ����ϰ� ����Ѵ�. 
		System.out.println(""); 
		ATCComponent toycar2 = new Metal();
		toycar2 = new MetalATCFrame(toycar2);
		toycar2 = new MetalATCBody(toycar2);
		toycar2 = new MetalATCPaint(toycar2);
		System.out.println("Metal car's cost is " + toycar2.getCost() + " won");
		// ��Ż �������� �����ϰ� ������ �����Ѵ�.
		// ��Ż ��ü�� �����ϰ� ������ �����Ѵ�.
		// ��Ż ����Ʈ�� �����ϰ� ������ �Ϸ��Ѵ�.
		// ��ü ������ ����ϰ� ����Ѵ�.
	}
	
	private static void test_part2() {
		/////////
		System.out.println("\n=== Part2 ===");
		// "PTC Store" ��� �̸����� �÷���ƽ �峭�� ���Ը� �����Ѵ�.
		// "MTC Store" ��� �̸����� ��Ż �峭�� ���Ը� �����Ѵ�.
		// "HTC Store" ��� �̸����� ȥ���� �峭�� ���Ը� �����Ѵ�.
		// "PTC Store"�� �̿��ϴ� "plastic_client1"�� �����
		// "MTC Store"�� �̿��ϴ� "plastic_client2"�� �����
		// "HTC Store"�� �̿��ϴ� "plastic_client3"�� �����
		// �� �Һ��ڴ� �ڽ��� �̿��ϴ� ���� sports/SUV �� �峭���� ���� �ֹ��Ѵ�.
	}
	
	private static void test_part3() {
		/////////
		System.out.println("\n=== Part3 ===");
		// "PTC Store" �� ����� ����
		// "PTC Store" �� ���� �̿��ϴ� �Һ��ڸ� �� �� ����
		// �� ���� �Һ��ڰ� �ҽ��� ������ ��û
		// �ҽ����� ����
		// ������ �Һ��ڸ� ���� ����Ʈ���� ����
		// �ҽ����� ����

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_part1();
		test_part2();
		test_part3();
	}

}
