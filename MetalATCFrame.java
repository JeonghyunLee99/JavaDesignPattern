
public class MetalATCFrame extends ComponentDecorator {

	public MetalATCFrame(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", ��Ż ������";
	}
	
	public int getCost() {
		return 30000 + toycar.getCost();
	}
	
}
