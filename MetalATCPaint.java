
public class MetalATCPaint extends ComponentDecorator {

	public MetalATCPaint(ATCComponent toycar) {
		this.toycar = toycar;
	}
	
	public String getComponentName() {
		return toycar.getComponentName() + ", ∏ﬁ≈ª ∆‰¿Œ∆Æ";
	}
	
	public int getCost() {
		return 300 + toycar.getCost();
	}
	
}
