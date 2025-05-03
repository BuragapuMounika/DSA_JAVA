public class Oops {
    public static void main (String args[]){
        Pen p1 =new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(40);



    }
    
}
 
class Pen{
    String color;
    int tip;

void setcolor(String newcolor){
    color = newcolor;
}
void  settip (int settip){
    tip =  settip ;
        
    }

}

class Student{
    String name;
    int reg;
    int marks;


void  calcpercen(int phy,int che,int bio){
    int per=(phy+che+bio)/3;
  System.out.println(per);
}
}