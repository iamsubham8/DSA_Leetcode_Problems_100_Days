// 225. Implement Stack using Queues
// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
// Implement the MyStack class:
// •	void push(int x) Pushes element x to the top of the stack.
// •	int pop() Removes the element on the top of the stack and returns it.
// •	int top() Returns the element on the top of the stack.
// •	boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:
// •	You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
// •	Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

//  https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {

private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
    //   moving all elements from main to helper
        while(main.size()>0){
          helper.add(main.remove());
        }
    //   add x in main queue

        main.add(x);
    //   moving all elements from helper to main

        while(helper.size()>0){
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        if(main.size()==0){
            return true ;
        }else{
            return false;
        }
    }
}
