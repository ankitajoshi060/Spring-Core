package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Demo demo = context.getBean("demo", Demo.class);
      System.out.println(demo);
      
      
      ExpressionParser parser = new SpelExpressionParser();
      Expression expression = parser.parseExpression("new String('hello world').length()");
      String str = expression.getValue(String.class);
      System.out.println(str);
      
      Expression expression2 = parser.parseExpression("T(java.lang.Math).pow(2,3)");
      int result = expression2.getValue(Integer.class);
      System.out.println(result);
      
      StandardEvaluationContext evaluationContext = new StandardEvaluationContext(demo);
  
      Expression expression3 = parser.parseExpression("id");
      expression3.setValue(evaluationContext, 10*3);
      System.out.println(demo.getId());
      
      
    }
}
