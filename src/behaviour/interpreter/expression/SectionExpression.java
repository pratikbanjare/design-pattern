package behaviour.interpreter.expression;

import behaviour.interpreter.context.Context;

import java.util.ArrayList;
import java.util.List;

public class SectionExpression implements Expression{

    private String sectionName;
    private List<Expression> expressions;

    public SectionExpression(String sectionName){
        this.sectionName = sectionName;
        expressions = new ArrayList<>();
    }

    public void addExpression(Expression expression){
        this.expressions.add(expression);
    }

    @Override
    public void interpret(Context context) {
        System.out.println("Interpret - "+ sectionName);
        context.setCurrentSection(sectionName);
        for(Expression expression : this.expressions){
            expression.interpret(context);
        }

    }
}
