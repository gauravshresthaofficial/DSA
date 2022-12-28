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
            if(rear == front)
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
        if(rear == (max - 1))
        {
            System.out.println("Queue is full.");
        }
        else
        {
            queue[++rear] = x;
            System.out.println(x + " is added in the queue.");
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
    }
}

