// Now, volume() returns the volume of a box.
class Box {
    double width;
    double height;
    double depth;
    // compute and return volume
    double volume(double w, double h, double d) {
        width=w;
        height=h;
        depth=d;
        return width * height * depth;
    }
    }
    class Boxdemo {
    public static void main(String args[]) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;
    // // assign values to mybox1's instance variables
    // mybox1.width = 10;
    // mybox1.height = 20;
    // mybox1.depth = 15;
    // /* assign different values to mybox2's
    // instance variables */
    // mybox2.width = 3;
    // mybox2.height = 6;
    // mybox2.depth = 9;
    // get volume of first box
    vol = mybox1.volume(10,20,15);
    System.out.println("Volume is " + vol);
    // get volume of second box
    vol = mybox2.volume(3,6,9);
    System.out.println("Volume is " + vol);
    }
    }