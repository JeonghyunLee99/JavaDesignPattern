
// �ֻ��� �����̽��� ��� �޴� �߻� Ŭ���� ATCClass
public abstract class ATCClass implements ATCComponent {
	
	// �� ��ǰ�� �̸��� �ʱ�ȭ
	String ComponentName = "���� ����";
	
	// ��ȯ	
	public String getComponentName() {
		return ComponentName;
	}
	// �� ��ǰ�� ������ ������ ������ ��ȯ�ϴ� �߻� �޼ҵ� ����
	public abstract int getCost();
}
