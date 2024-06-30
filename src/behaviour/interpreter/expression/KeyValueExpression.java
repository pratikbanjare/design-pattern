package behaviour.interpreter.expression;

import behaviour.interpreter.context.Context;

public class KeyValueExpression implements Expression{

    private String key;
    private String value;

    public KeyValueExpression(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        System.out.println("Interpret " + key + ", "+ value);
        context.addKeyValue(key,value);
    }
}
