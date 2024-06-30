package behaviour.interpreter.expression;

import behaviour.interpreter.context.Context;

public interface Expression {
    public void interpret(Context context);
}
