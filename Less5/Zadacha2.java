package Less5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Zadacha2 {
    public static void main(String[] args) {
        String formula = "(a * {b + <sh>}";
        
        System.out.println(isValid(formula));
    }
    public static boolean isValid(String formula) {
        Map<Character, Character> bracketsDict = new HashMap<>();
        bracketsDict.put('(', ')');
        bracketsDict.put('[', ']');
        bracketsDict.put('{', '}');
        bracketsDict.put('<', '>');

        ArrayDeque<Character> brackets = new ArrayDeque<>();
        for (char c : formula.toCharArray()) {
            if (bracketsDict.containsKey(c)){    // Если с является открывающей скобкой
                brackets.add(c);
            }
            else if (bracketsDict.containsValue(c)) { // Если с закрывающая скобка
                if (brackets.isEmpty())
                    return false;
                char openingBracket =  brackets.removeLast();
                if (bracketsDict.get(openingBracket) != c) {     // Если закрывающая скобка не соответствует открывающей
                    return false;
                }
            }
        }
        return brackets.isEmpty();    
    }
}
