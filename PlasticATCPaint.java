
public class PlasticATCPaint extends ComponentDecorator {

	public PlasticATCPaint(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", 플래스틱 차체";
	}
	
	public int getCost() {
		return 100 + toycar.getCost();
	}
	
}
