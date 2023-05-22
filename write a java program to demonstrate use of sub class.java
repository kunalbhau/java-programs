// write a java program to demonstrate use of sub class //


class parent{
    int m;
    void get_m(int m)
    {
        this.m =m;
    }
    void display_m()
    {
    system.out.println("this is from 
     parent : m = "+m);


    }

    class child extends parent{
        int n;
        void get_n(int n)
        {
            this.n =n;

        }
        void display_n()
        {
        public static void println("this is from child:n ="+n);
        }
    }
    class child demo{
        public static void main (string arg[])
         {
            child c= new child;
            c.get_m=10;
            c.get_n=20;
            c.display_m();
            c.display_n();
         }

    }
}