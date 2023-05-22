// java program to demonstrate use of nested class //

import java.util.*;

class outer
{
    int m=10;
    class inner
    {
        int n= 20;
        void display()
        {
            system.out.println("m="+m);
            system.out.println("n ="+n);

        }

    }
}
class nested demo{
    public static void main (string arg[])
    {
        outer outobj= new outer();
        outer.inner inobj = outobj.new inner();
        inobj.display();
    }
}