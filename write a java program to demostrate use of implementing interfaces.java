// write a java program to demonstrate use of implenting interfaces //

import java.lang.*;
interface Area

{
    final static float pi=3.14F;
    float compute(float x, float y);
}

class rectangle implements Area{
    public float compute(float x, float y)

    {
        return  (pi*x*y);

    }
}
class circle implements Area{
    public float compute(float x, flaot y)
    {
        return (pi*x*y)
    }

}
class interfacedemo{
    public static void main(string a[])

    {
        rectangle rect =new rectangle;
        circle cir=new circle();
        Area A;
        A= rect;
        system.out.println("Area of rectangle "= +A.compute (10,20));
        A= cir;
        system.out.println("Area of circle "= + A.compute (30,0));
    }
}