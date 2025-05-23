// 155. Min Stack
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
// •	MinStack() initializes the stack object.
// •	void push(int val) pushes the element val onto the stack.
// •	void pop() removes the element on the top of the stack.
// •	int top() gets the top element of the stack.
// •	int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

// https://leetcode.com/problems/min-stack/

class MinStack {
     private Stack<Integer> st;
     private Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if(st.size()==0 || min.peek()>=val){
            min.push(val);
        }

          st.push(val);
    }

    public void pop() {
        int ele1 = st.pop();
        int ele2 = min.peek();

        if(ele1==ele2){
            min.pop();
        }

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
