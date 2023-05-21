// write a java program to define a class 
// define instance methods for setting and retrieving
// values of instance variables and instantiate its
//object//

import java.util.*;

class emp{
    String name;
    int id;
    string address;
    void getdata(string, int id, string address);
{
    this.name=name;
    this.id=id;
    this.address=address;

}
void putdata()
{
    system.out.println("employee details are:");
    system.out.println("name:" +name);
    system.out.println("ID:" +id);
    system.out.println("Address:"+address);

}

}
class empdemo{
    public static void main(string arg[])
    {
        emp= new emp;
        e.getdata("smith" 76589, "gulbarga");
        e.putdata();
    }
}