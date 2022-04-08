import java.util.LinkedList;
public class Principal
{
    public static  void main(String[] args)
    {
        LinkedList cola = new LinkedList();

        for (int i = 1; i < 10; i++)
        {
            cola.offer(i);
        }
        while (cola.peek()!=null)
        {
            System.out.println(cola.poll());
        }
    }

}
