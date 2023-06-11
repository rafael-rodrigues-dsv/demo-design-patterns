package org.example;

import org.example.contracts.Expression;
import org.example.models.AndExpression;
import org.example.models.OrExpression;
import org.example.models.TerminalExpression;

/** Interpreter in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class Main {
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