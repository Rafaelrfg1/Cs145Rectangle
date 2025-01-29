import java.util.Scanner;



public class Rectangle {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        boolean isRectangle = false;
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 5; i++){
            System.out.println("|                                                       |");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("What would you like your bottom left x coordinate to be?(From 0 to 20)");
        int x1 = input.nextInt();
        System.out.println("What would you like your bottom left y coordinate to be?(From 0 to 20)");
        int y1 = input.nextInt();
        System.out.println("What would you like your top right x coordinate to be?(From 0 to 20)");
        int x4 = input.nextInt();
        System.out.println("What would you like your top right y coordinate to be?(From 0 to 20)");
        int y4 = input.nextInt();
        RectangleTest rectangle = new RectangleTest();
        rectangle.makeRectangle(isRectangle, x1, y1, x4, y4);
        
            
        
        
       
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Height: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        input.close();
        
        
    }
}
