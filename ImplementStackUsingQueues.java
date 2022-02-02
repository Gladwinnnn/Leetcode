// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// --> void push(int x) Pushes element x to the top of the stack.
// --> int pop() Removes the element on the top of the stack and returns it.
// --> int top() Returns the element on the top of the stack.
// --> boolean empty() Returns true if the stack is empty, false otherwise.

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False

class MyStack {
    
    private class Node {
        private int data;
        private Node next;
        
        private Node(int data) {
            this.data = data;
        }
    }
    
    private Node top;

    public MyStack() {
        
    }
    
    public void push(int x) {
        Node node = new Node(x);
        node.next = top;
        top = node;
    }
    
    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }
    
    public int top() {
        return top.data;
    }
    
    public boolean empty() {
        return top == null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */