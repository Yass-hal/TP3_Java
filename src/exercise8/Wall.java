package exercise8;

public class Wall {
    private double Width;
    private double Height;
    public Wall(){

    }
    public Wall(double w,double h){
        if (h<0) this.Height=0;
        else this.Height=h;
        if (w<0) this.Width=0;
        else this.Width=w;
    }
    public double getHeight(){
        return this.Height;
    }
    public double getWidth(){
        return this.Width;
    }
    public void setHeight(double h){
        if (h<0) this.Height=0;
        else this.Height=h;
    }
    public void setWidth(double w){
        if (w<0) this.Width=0;
        else this.Width=w;
    }
    public double getArea(){
        return this.Width*this.Height;
    }
    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
