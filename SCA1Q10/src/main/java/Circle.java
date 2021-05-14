import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle {
	
	private P A;

	public P getA() {
		return A;
	}
	@Autowired
	@Qualifier("x")
	public void setA(P a) {
		A = a;
	}
	public void output() {
		System.out.println("Drawing Circle");
		System.out.println("Center of circle is (" +this.getA().getX()+ "," +this.getA().getY()+ ")");

	}
}
