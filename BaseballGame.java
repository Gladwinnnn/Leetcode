// You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

// At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

// An integer x - Record a new score of x.
// "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
// "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
// "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
// Return the sum of all the scores on the record.

// Input: ops = ["5","2","C","D","+"]
// Output: 30
// Explanation:
// "5" - Add 5 to the record, record is now [5].
// "2" - Add 2 to the record, record is now [5, 2].
// "C" - Invalidate and remove the previous score, record is now [5].
// "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
// "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
// The total sum is 5 + 10 + 15 = 30.

// Input: ops = ["5","-2","4","C","D","9","+","+"]
// Output: 27
// Explanation:
// "5" - Add 5 to the record, record is now [5].
// "-2" - Add -2 to the record, record is now [5, -2].
// "4" - Add 4 to the record, record is now [5, -2, 4].
// "C" - Invalidate and remove the previous score, record is now [5, -2].
// "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
// "9" - Add 9 to the record, record is now [5, -2, -4, 9].
// "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
// "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
// The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.

// Input: ops = ["1"]
// Output: 1

class Solution {
    public int calPoints(String[] ops) {
        Stack stack = new Stack();
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        
        for (int i = 0; i < ops.length; i++) {
            if ((ops[i] + "").equals("C")) {
                stack.pop();   
            } else if((ops[i] + "").equals("D")) {
                stack.push(stack.peek() * 2);
            } else if ((ops[i] + "").equals("+")) {
                int topOfStack = stack.peek();
                stack.pop();
                int total = topOfStack + stack.peek();
                stack.push(topOfStack);
                stack.push(total);
            } else if (Integer.parseInt(ops[i]) >= minValue && Integer.parseInt(ops[i] + "") <= maxValue) {
                stack.push(Integer.parseInt(""+ ops[i]));
            }
        }
        
        int result = 0;      
        while (!stack.isEmpty()) {
            result += stack.peek();
            stack.pop();
        }
        
        return result;
    }
    
    public class Stack {
        Node top;
        
        public class Node {
            int data;
            Node next;
            
            public Node(int data) {
                this.data = data;
            }
        }
        
        public void push(int data) {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }

        public void pop() {
            top = top.next;
        }

        public int peek() { return top.data; }
        
        public boolean isEmpty() { return top == null; }
    }
}