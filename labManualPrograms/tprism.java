import java.util.Scanner;
class prism{
    double l;
    double h;
    double w;
    public void setPrism(double length,double height,double width){
        // prism(double length,double height,double width){
        l=length;
        h=height;
        w=width;
    }
    public double topArea(){
        return l*w;
    }
    public double bottomArea(){
        return l*w;
    }
    public double leftArea(){
        return h*w;
    }
    public double rightArea(){
        return h*w;
    }
    public double frontArea(){
        return l*h;
    }
    public double backArea(){
        return l*h;
    }
    public double Area(){
        return 2*(l*w+h*w+h*l);
    }

}
class tprism{
    public static void main(String[] args) {
        double ta,ba,ra,la,fa, bca,a;
        Scanner s= new Scanner(System.in);
        System.out.print("enter length:");
        double length=s.nextDouble();
        System.out.print("enter heigth:");
        double height=s.nextDouble();
        System.out.print("enter width:");
        double width=s.nextDouble();
        prism p=new prism();
        p.setPrism(length, height, width);
        ta=p.topArea();
        System.out.println("top area:"+ta);
        ba=p.bottomArea();
        System.out.println("bottom area:"+ba);
        ra=p.rightArea();
        System.out.println("right area:"+ra);
        la=p.leftArea();
        System.out.println("left area:"+la);
        fa=p.frontArea();
        System.out.println("front area:"+fa);
        bca=p.backArea();
        System.out.println("bca area:"+bca);
        a=p.Area();
        System.out.println("area:"+a);
    }
}