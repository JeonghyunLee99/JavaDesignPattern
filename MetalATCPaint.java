
public class MetalATCPaint extends ComponentDecorator {

	public MetalATCPaint(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", ��Ż ����Ʈ";
	}
	
	public int getCost() {
		return 300 + toycar.getCost();
	}
	
}
