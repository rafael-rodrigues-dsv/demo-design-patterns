package org.example;

import org.example.contract.Expression;
import org.example.model.AndExpression;
import org.example.model.OrExpression;
import org.example.model.TerminalExpression;

/** Interpreter in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class MainInterpreter {
    public static void main(String[] args) {
        testInterpreter();
    }

    private static void testInterpreter() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}