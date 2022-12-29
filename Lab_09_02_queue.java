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
            if(front == -1 && rear == -1)
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
        if(rear == max -1)
        {
            System.out.println("\nQueue is full");
        }
        else if(front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = x;
        } else{
            rear++;
            queue[rear] = x;
        }
        
    }

    void Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("\n" + "Queue is empty.");
        }
        else if (front == rear){
            front = rear = -1;
        } else {
            front++;
        }
    }

    void Search(int key)
    {
        boolean flag = false;
        if(isEmpty())
        {
            System.out.println("\n" + "Queue is empty.");
        }
        else 
        {
            int i;
            for(i = front; i <= rear ; i++)
            {
                if(queue[i] == key)
                {
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                System.out.println("\n" + key + " found at " + (i+1) + " position.");
            }
            else
            {
                System.out.println("\n" + key + " not found.");
            }
        }
        
    }

    void Display()
    {
        if(isEmpty())
        {
            System.out.println("\n" + "Queue is empty.");
        }
        else 
        {
            for(int i = front; i <= rear ; i++ )
            {
                System.out.print(queue[i] + " ");
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
        Queue.Display();

        Queue.Search(3);
        
        Queue.Dequeue();
        Queue.Dequeue();
        Queue.Display();
    }
}

