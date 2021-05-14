import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Tri implements ApplicationContextAware{
	private P A;
	private P B;
	private P C;
	private ApplicationContext context;
	
	public P getA() {
		return A;
	}
	public void setA(P a) {
		A = a;
	}
	public P getB() {
		return B;
	}
	public void setB(P b) {
		B = b;
	}
	public P getC() {
		return C;
	}
	public void setC(P c) {
		C = c;
	}
	
	public void output() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A (" +this.getA().getX()+ "," +this.getA().getY()+ ")");
		System.out.println("Point B (" +this.getB().getX()+ "," +this.getB().getY()+ ")");
		System.out.println("Point C (" +this.getC().getX()+ "," +this.getC().getY()+ ")");

	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
	}
	
	
	

}
