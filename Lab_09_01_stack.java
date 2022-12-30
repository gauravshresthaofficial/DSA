//Wap to implement search() operations in stack.

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

    void Search(int key) 
    {
        boolean flag = false;
        int temp = top;

        while(temp != -1)
        {
            if(isEmpty())
            {
                System.out.println("\nStack is empty.");
            }

            if(stack[temp] == key)
            {
                flag = true;
                break;
            }
            else
            {
                temp--;
            }
        }

        if(flag)
        {
            System.out.println("\n" + key + " found.");
        }
        else
        {
            System.out.println("\n" + key + " not found.");
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
                System.out.print(stack[top] + " ");
                top--;
            }
        }
        
    }


}

public class Lab_09_01_stack {
    public static void main (String[] args)
    {
        CreateStack stack = new CreateStack();

        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(2);
        stack.Display();
        stack.Search(3);
    }
}