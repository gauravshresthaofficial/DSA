import java.util.Queue;

class CreateQueue {
    static final int max = 10;
    int front;
    int rear;

    int queue[] = new int[max];

    CreateQueue() {
        front = -1;
        rear = -1;
    }

    //check whether the queue is empty
    
        boolean isEmpty()
        {
            if(front == -1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    //method to add new element
    void Enqueue(int x)
    {
        if(isEmpty())
        {
            front = 0;
        }
        if(rear == (max - 1))
        {
            System.out.println("Queue is full.");
        }
        else
        {
            queue[++rear] = x;
            // System.out.println(x + " is added in the queue.");
        }
        
    }

    void Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            ++front;
        }
    }

    void Search(int key)
    {
        boolean flag = false;
        if(isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else 
        {
            for(int i = front; i <= rear ; i++)
            {
                if(queue[i] == key)
                {
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                System.out.println(key + " found");
            }
            else
            {
                System.out.println(key + " not found.");
            }
        }
        
    }

    void Display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else 
        {
            for(int i = front; i <= rear ; i++ )
            {
                System.out.println(queue[i] + " ");
            }
        }
        
    }
}

public class Lab_09_02_queue
{   
    public static void main(String[] args) {
        CreateQueue Queue = new CreateQueue();
        
        Queue.Enqueue(2);
        Queue.Enqueue(3);
        Queue.Enqueue(5);

        Queue.Search(3);
        Queue.Display();
    }
}

