
public class PlasticATCPaint extends ComponentDecorator {

	public PlasticATCPaint(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", �÷���ƽ ��ü";
	}
	
	public int getCost() {
		return 100 + toycar.getCost();
	}
	
}
