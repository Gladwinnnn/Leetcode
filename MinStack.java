// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// --> MinStack() initializes the stack object.
// --> void push(int val) pushes the element val onto the stack.
// --> void pop() removes the element on the top of the stack.
// --> int top() gets the top element of the stack.
// --> int getMin() retrieves the minimum element in the stack.

// Input
// ["MinStack","push","push","push","getMin","pop","top","getMin"]
// [[],[-2],[0],[-3],[],[],[],[]]

// Output
// [null,null,null,null,-3,null,0,-2]

// Explanation
// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin(); // return -3
// minStack.pop();
// minStack.top();    // return 0
// minStack.getMin(); // return -2

class MinStack {

    /** initialize your data structure here. */
    private class Node {
        private int data;
        private Node next;
        
        private Node(int data) {
            this.data = data;    
        }
    }
    
    private Node top;
    private Node minTop;
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        Node node = new Node(x);
        node.next = top;
        top = node;
        
        Node minNode = new Node(x);
        if (minTop == null || (minTop != null && x <= minTop.data)) {
            minNode.next = minTop;
            minTop = minNode;
        }
    }
    
    public void pop() {
        if (top.data == minTop.data) minTop = minTop.next;
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return minTop.data;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */