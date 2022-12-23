//Wap to implement push() and pop() operations in stack.

class CreateStack {
    static final int max = 10;
    int top;

    //assigning MAX size of the stack
    int stack[] = new int[max];

    CreateStack () {
        top = -1;
    }

     // the stack is empty or not  
  void isEmpty() {
    if(top == -1) {
      System.out.println("Stack is empty.");
    } else {
      System.out.println("Stack is not empty.");
    }
  }

    void push(int x)
    {
        if(top == (max - 1))
        {
            System.out.println("Stack size limit reached.");

        }
        else 
        {
            stack[++top] = x;
            System.out.println(x + " is added into the stack.");
        }
    }
}

public class Lab_08_stack {
    public static void main (String[] args)
    {
        CreateStack stack = new stack();

        stack.pop(3);
    }
}