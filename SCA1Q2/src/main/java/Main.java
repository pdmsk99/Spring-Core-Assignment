

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Query.xml");
		Query que=(Query) context.getBean("Query");
		que.output();

	}

}
