import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.third.Triangle;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
		Custmr cust=(Custmr) context.getBean("Custmr");
		cust.printDetails();
	}

}
