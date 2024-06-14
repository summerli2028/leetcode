class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty, no opening bracket to match with
                if (stack.isEmpty()) {
                    return false;
                }
                // Check if the closing bracket matches the top of the stack
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all opening brackets have been matched
        return stack.isEmpty();
    }}
