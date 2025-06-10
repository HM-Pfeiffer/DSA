class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenPairs = new HashMap<>();
        parenPairs.put('}','{');
        parenPairs.put(']','[');
        parenPairs.put(')','(');

        Deque<Character> stack = new ArrayDeque<>();

        // System.out.println(parenPairs);
        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(parenPairs.containsKey(c) && parenPairs.get(c) == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}