class dNode
{
    int val;
    dNode next;
    dNode prev;
    dNode(int val)
    {
        this.val=val;
    }
}
public class doublylist {
    public static void print(dNode head)
    {
        dNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printreverse(dNode tail)
    {
        dNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node)
    {
        dNode temp=node;
        while(temp.prev!=null)
        {
            temp=temp.prev;
        }
        print(temp); 
    }
    public static void main(String[] args) {
    dNode a=new dNode(10);
    dNode b=new dNode(20);
    dNode c=new dNode(30);
    dNode d=new dNode(40);
    a.next=b;  b.prev=a;
    b.next=c;  c.prev=b;
    c.next=d;  d.prev=c;
   /// print(a);
   // System.out.println();
   // printreverse(d);
    display(c);
    
    }

}
