//Wap to implement push() and pop() operations in stack.

// A Push operation may involve the following steps −
// Step 1 − Checks if the stack is full.

// Step 2 − If the stack is full, produces an error and exit.

// Step 3 − If the stack is not full, increments top to point next empty space.

// Step 4 − Adds data element to the stack location, where top is pointing.

// Step 5 − Returns success.




// A Pop operation may involve the following steps −

// Step 1 − Checks if the stack is empty.

// Step 2 − If the stack is empty, produces an error and exit.

// Step 3 − If the stack is not empty, accesses the data element at which top is pointing.

// Step 4 − Decreases the value of top by 1.

// Step 5 − Returns success.

class CreateStack {
    static final int max = 10;
    int top;

    //assigning MAX size of the stack
    int stack[] = new int[max];

    CreateStack () {
        top = -1;
    }

     // the stack is empty or not  
  boolean isEmpty() {
    if(top == -1)
        return true;
    else
        return false;
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

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty. Deletion not possible.");
        }
        else{
            int x = stack[top--];
            System.out.println(x + " is deleted from the stack.");
        }

    }

    void Display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
        }
        else 
        {
            while (top != -1)
            {
                System.out.print(stack[top]);
                top--;
            }
        }
        
    }


}

public class Lab_08_stack {
    public static void main (String[] args)
    {
        CreateStack stack = new CreateStack();

        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.Display();
    }
}
