
public class PlasticATCFrame extends ComponentDecorator {

	public PlasticATCFrame(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", �÷���ƽ ������";
	}
	
	public int getCost() {
		return 10000 + toycar.getCost();
	}
	
}
