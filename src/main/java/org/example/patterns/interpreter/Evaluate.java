package org.example.patterns.interpreter;

import org.example.patterns.interpreter.interfaces.Expression;
import org.example.patterns.interpreter.model.Number;
import org.example.patterns.interpreter.operators.Minus;
import org.example.patterns.interpreter.operators.Plus;

import java.util.List;
import java.util.Stack;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Evaluate implements Expression {
    private final Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        List<String> operands = getOperandsFromExpression(expression).reversed();
        List<String> operators = getOperatorsFromExpression(expression);
        for (String number : operands) {
            expressions.push(new Number(Integer.parseInt(number)));
        }
        for (String operator : operators) {
            if (operator.equals("+")) {
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            } else if (operator.equals("-")) {
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }

        evaluate = expressions.pop();
    }


    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }

    private List<String> getOperatorsFromExpression(String expression) {
        /*
         * The regular expression pattern is used to match any of the characters +, -, *, or /. Here's an explanation of the pattern:
         * [ ]: Square brackets are used to define a character class. It matches any single character that is listed within the brackets.
         * +: The plus symbol is a special character in regular expressions, but it loses its special meaning when placed within square brackets.
         *    It matches the literal plus symbol.
         * \\: The backslash is an escape character in regular expressions. It is used to escape special characters and give them their literal meaning.
         *     In this case, it is used to escape the hyphen - to match it literally.
         * -: The hyphen is another special character in regular expressions. It is used to define a range of characters within a character class.
         *    However, when placed at the beginning or end of the character class, it is treated as a literal hyphen.
         * *: The asterisk is a special character in regular expressions. It is used to match zero or more occurrences of the preceding character or group.
         * /: The forward slash is a literal character that matches itself.
         */
        // Therefore, the pattern [+\\-*/] will match any occurrence of the characters +, -, *, or / in a string.
        return Pattern.compile("[+\\-*/]")
                .matcher(expression)
                .results()
                .map(MatchResult::group)
                .toList();
    }

    private List<String> getOperandsFromExpression(String expression) {
        /*
         * The regular expression pattern \\b\\d+\\b is used to match any sequence of one or more digits in a string. Here's an explanation of the pattern:
         *
         * \b: The \b represents a word boundary in regular expressions.
         *     It matches a position between a word character (as defined by \w) and a non-word character (as defined by \W).
         *     It essentially matches the empty space between a word and a non-word character.
         * \d: The \d is a shorthand character class that represents any digit from 0 to 9. It matches a single digit.
         * +: The plus symbol is a quantifier in regular expressions. It matches one or more occurrences of the preceding element.
         *    In this case, it matches one or more digits.
         * \b: Another word boundary to ensure that the match ends at the boundary of the number.
         *
         * So, the pattern \b\d+\b will match any sequence of one or more digits in a string, where the sequence is surrounded by word boundaries.
         * This pattern can be used to extract individual numbers from a string
         */
        return Pattern.compile("\\b\\d+\\b")
                .matcher(expression)
                .results()
                .map(MatchResult::group)
                .toList();
    }
}
