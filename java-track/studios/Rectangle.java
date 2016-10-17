
public class Rectangle {

    private String name;
    private int height;
    private int length;

    public Rectangle(String name, int height, int length)

    {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    public int area()

    {
        return this.height * this.length;
    }

    

    public int perimeter()

    {
        return 2 * (this.height + this.length);
    }

    public boolean square()

    {
        if(this.length == this.height)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public String isGreater(Rectangle R)

    {

        if(this.area() > R.area())
        {

            return this.name;

        }
        else if (this.area() == R.area())
        {
            return this.name + " is equal to " + R.name;
        }

        else

        {
            return R.name;
        }

    }
    

    public static void main(String[] args)

    {

        Rectangle one = new Rectangle("One", 7, 8);

        Rectangle two = new Rectangle("Two", 5, 5);   

        System.out.println("Rectangle One Perimeter = " + one.perimeter());

        System.out.println("Rectangle One Area = " + one.area());

        System.out.println(one.isGreater(two));

        System.out.println("Rectangle Two Perimeter = " + two.perimeter());

        System.out.println("Rectangle Two Area = " + two.area());

        

        if (one.area() > two.area())
        {
            System.out.println("Rectangle " + one.name + " is greater.");
        }

        else
        {
            System.out.println("Rectangle " + two.name + " is greater.");
        }
        one.isGreater(two);

    }

    

}
