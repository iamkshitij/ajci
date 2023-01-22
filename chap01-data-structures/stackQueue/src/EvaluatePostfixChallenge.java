public class EvaluatePostfixChallenge {

    public static int evaluatePostFix(String expression) {
        Stack<Integer> characterStack = new Stack<>(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(!Character.isDigit(ch)){
                Integer v1 = characterStack.pop();
                Integer v2 = characterStack.pop();

                switch (ch){
                    case '+':
                        characterStack.push(v2+v1);
                        break;
                    case '-':
                        characterStack.push(v2-v1);
                        break;
                    case '*':
                        characterStack.push(v2*v1);
                        break;
                    case '/':
                        characterStack.push(v2/v1);
                        break;
                }

            }else{
                characterStack.push(Character.getNumericValue(ch));
            }
        }

        return characterStack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFix("921*-8-4+"));
    }
}
