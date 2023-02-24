public abstract class Vehicle {
    int year_of_manufacture;

    public Vehicle(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    abstract String getData();
    abstract void putData();

}

class MyTwoWheeler extends TwoWheeler
{
    String store_purchased;
    public MyTwoWheeler(int year_of_manufacture,String colour,String made) {
        super(year_of_manufacture, colour, made);
    }
    String getData()
    {
        return super.getData()+" purchased at "+store_purchased;
    }
}

class Demo
{
    public static void main(String args[])
    {
        MyTwoWheeler myTW= new MyTwoWheeler(2000,"Blue","Desire");
        myTW.store_purchased="Varun Motors";
        System.out.println(myTW.getData());
    }
}