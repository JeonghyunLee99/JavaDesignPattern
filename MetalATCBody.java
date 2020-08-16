
public class MetalATCBody extends ComponentDecorator {
	
	// ATCClass Ŭ������ �ν��Ͻ� ����
	ATCClass aTCClass;
	
	// ATCComponent Ŭ���� ������ �ν��Ͻ� ���� toycar�� �Ű������� �޾Ƽ� �⺻ �����ڸ� �̿��� �ʱ�ȭ�մϴ�.
	public MetalATCBody(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	// �� ��ǰ�� �̸��� ��ȯ�ϴ� �޼ҵ�
	public String getComponentName() {
		return toycar.getComponentName() + ", ��Ż ��ü";
	}
	
	// �� ��ǰ�� ������ ��ȯ�ϴ� �޼ҵ�
	public int getCost() {
		return 3000 + toycar.getCost();
	}
	
}
