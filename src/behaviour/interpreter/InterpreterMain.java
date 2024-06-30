package behaviour.interpreter;

import behaviour.interpreter.context.Context;
import behaviour.interpreter.expression.Expression;
import behaviour.interpreter.expression.KeyValueExpression;
import behaviour.interpreter.expression.SectionExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterpreterMain {

    public static void main(String[] args) {

        Context context = new Context();
        List<Expression> expressions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/behaviour/interpreter/resources/file.ini"))) {
            String line;
            SectionExpression currentSection = null;

            while ( (line = reader.readLine()) != null ){
                line = line.trim();

                if (line.startsWith("[") && line.endsWith("]")){
                    if (currentSection != null){
                        // the if condition will get executed when all key value expression are added to currentSection
                        // for same resons, currentsection is being added to expression list after the while loop.
                        // the execution of this block is also an indication of completion of reading current section.
                        expressions.add(currentSection);
                    }
                    currentSection = new SectionExpression(line.substring(1,line.length()-1));
                } else if (line.contains("=")){
                    String[] parts = line.split("=");
                    String key = parts[0];
                    String value = parts[1];
                    currentSection.addExpression(new KeyValueExpression(key,value));
                }
            }

            if (currentSection != null ){
                expressions.add(currentSection);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Expression expression : expressions){
            expression.interpret(context);
        }
        System.out.println("Size of expression list - "+ expressions.size());

        context.printConfiguration();

        System.out.println(context.getSection("database").get("proxy"));


    }
}
