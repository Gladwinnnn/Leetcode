// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order

// Input: s = "()"
// Output: true

// Input: s = "()[]{}"
// Output: true

// Input: s = "(]"
// Output: false

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') 
            {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')')
            {
                if (!stack.isEmpty())
                {
                    if (stack.peek() == '(')
                    {
                        stack.pop();
                    }
                    else 
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else 
                {
                    stack.push(s.charAt(i));
                }
            }
            else if (s.charAt(i) == ']')
            {
                if (!stack.isEmpty())
                {
                    if (stack.peek() == '[')
                    {
                        stack.pop();
                    }
                    else 
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else 
                {
                    stack.push(s.charAt(i));
                }
            }
            else if (s.charAt(i) == '}')
            {
                if (!stack.isEmpty())
                {
                    if (stack.peek() == '{')
                    {
                        stack.pop();
                    }
                    else 
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else 
                {
                    stack.push(s.charAt(i));
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    class Stack {
        class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
            }
        }
    
        Node top;
    
        public void push(char data) {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }

        public void pop() {
            top = top.next;
        }

        public boolean isEmpty() {
            return top == null;
        }
        
        public char peek() {
            return top.data;
        }
    }
}