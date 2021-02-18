public class CircularQueueByArray {
  int arr[];
  int size;
  int beginning;
  int top;
  public CircularQueueByArray(int size)
  {
    arr= new int[size];
    this.size = size;
    beginning = -1;
    top = -1;
  }
  public boolean isEmpty()
  {
    if(top == -1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public boolean isFull()
  {
    if(top+1 == beginning)
    {
      return true;
    }
    else if((beginning== 0) && (top+1 == size))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void enqueue(int value)
  {
    if(isFull())
    {
      System.out.println("overflow");
    }
    else if(isEmpty())
    {
      beginning = 0 ;
      top ++;
      arr[beginning] = value;
    }
    else
    {
        if(top+1 == size)
        {
          top= 0;
        }
        else
        {
          top++;
        }
        arr[top]= value;
    }

  }

  public void dequeue()
  {
    if(isEmpty())
    {
      System.out.println("Empty");
    }
    else
    {
      System.out.println(arr[beginning]);
      if(beginning == top)
      {
        beginning= top = -1;
      }
      else if(beginning+1 == size) {
        beginning = 0;
      }
      else
      {
        beginning++;
      }

    }
  }
public void traverse()
{
  for(int i=0;i<size;i++)
  {
    System.out.println(arr[i]);
  }
}
}
