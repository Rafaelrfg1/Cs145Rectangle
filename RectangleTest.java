
public class RectangleTest extends Object{
    


    
    private int length;
    private int width;
    private int perimeter;
    private int area;
    
    public void makeRectangle(boolean isRectangle, int x1, int y1, int x4, int y4){
        if( length < 0 ||  width < 0 || length > 20 || width > 20){
            isRectangle = false;        
            System.out.println("This does not make a rectangle within valid parameters/n Please try again");
            }   else {
                    isRectangle = true;
                    this.length = Math.abs(x4 - x1);
                    this.width = Math.abs(y4 - y1);
                    this.perimeter = 2 * (length + width);
                    this.area = length * width;
                    }
    }
   

    public int getLength(){
        return length;
    
    }

    public int getWidth(){
        return width;

    }

    public int getPerimeter(){
        return perimeter;

    }

    public int getArea(){
        return area;

    }   
    

}
