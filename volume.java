import java.util.Scanner;

class Box{
    double height;
    double width;
    double breadth;

    Box(double h, double w, double b){
        height=h;
        width=w;
        breadth=b;
    }
    double volume(){
        return height*width*breadth;

    }
}

public class volume {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter height: ");
        double height= sc.nextDouble();
        System.out.print("Enter width: ");
        double width= sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth= sc.nextDouble();
        Box myBox= new Box(height, width, breadth);
        

        double vol;
        vol= myBox.volume();
        System.out.println("Volume is: "+vol);
        
    }
}

