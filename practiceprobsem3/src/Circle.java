import java.math.*;

import java.util.Scanner;
class Circle {
    double radius;
    Circle(double r)
    {
        radius=r;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}

class Sector extends Circle
{
    double radian;
    Sector(double r,double radian) {
        super(r);
        this.radian=radian;
    }

    double calAreaSec()
    {
        return (0.5*radius*radius*radian);
    }
}

class Segment extends Circle
{
    double length;
    Segment(double r,double length)
    {
        super(r);
        this.length=length;
    }

    double calAreaSeg()
    {
        double area= (((radius*radius)*Math.acos((radius-length)/radius))-((radius-length)*(Math.sqrt((2*radius*length)-(length*length)))));
        //return (((radius*radius)*Math.acos((radius-length)/radius)) - ((radius-length)*Math.sqrt(((2*radius*length)-(length*length)))));
        return area;
    }
}

class inheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius =sc.nextDouble();
        Circle ci=new Circle(radius);
        System.out.println("The area of the circle is: "+ ci.area());

        System.out.println("Enter the control angle of a sector in radians");
        double radian=sc.nextDouble();
        Sector sec= new Sector(radius,radian);
        System.out.println("The area of the sector is: "+ sec.calAreaSec());

        System.out.println("Enter the length of the segment");
        double length=sc.nextDouble();
        Segment seg =new Segment(radius,length);
        System.out.println("The area of the segment is: "+ seg.calAreaSeg());

}
}