public class TwoWheeler extends Vehicle {
    String colour, made;

    public TwoWheeler(int year_of_manufacture, String colour, String made) {
        super(year_of_manufacture);
        this.colour = colour;
        this.made = made;
    }

    @Override
    String getData() {
        return "Two Wheeler: " + made + " " + colour + " " + year_of_manufacture;
    }

    @Override
    void putData() {

    }
}
