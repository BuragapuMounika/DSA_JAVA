import java.util.*;
public class AreaCircle {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter the radius of the  circle: ");
    float  radius = sc.nextFloat();
    float area= 3.14f * radius * radius;
    System.out.println("the area of the circle is :"+ area);
    sc.close();
}    
}

