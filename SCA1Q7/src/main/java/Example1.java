import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Example1 {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();

		Expression expression = expressionParser.parseExpression("'hiii'");
		String strv = expression.getValue(String.class);
		System.out.println("1\n" + strv);

		expression = expressionParser.parseExpression("'hello'");
		strv = expression.getValue(String.class);
		System.out.println("2\n" + strv);

		expression = expressionParser.parseExpression("'welcome'");
		strv = expression.getValue(String.class);
		System.out.println("3\n" + strv);

		expression = expressionParser.parseExpression("'to'");
		strv = expression.getValue(String.class);
		System.out.println("4\n" + strv);

		expression = expressionParser.parseExpression("'my'");
		strv = expression.getValue(String.class);
		System.out.println("5\n" + strv);

		expression = expressionParser.parseExpression("'code'");
		strv = expression.getValue(String.class);
		System.out.println("6\n" + strv);

		expression = expressionParser.parseExpression("'this is'");
		strv = expression.getValue(String.class);
		System.out.println("7\n" + strv);

		expression = expressionParser.parseExpression("'what i did'");
		strv = expression.getValue(String.class);
		System.out.println("8\n" + strv);
	}
}