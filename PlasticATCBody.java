
public class PlasticATCBody extends ComponentDecorator {

	public PlasticATCBody(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", �÷���ƽ ��ü";
	}
	
	public int getCost() {
		return 1000 + toycar.getCost();
	}
	
}
