package oops;

public class Box {  
       private int width;  
       private int height;  
       private int depth;  
       Box(int width, int height, int depth){  
            this.width = width;  
            this.height = height;  
            this.depth = depth;  
       }  
       int getVolume() {  
            return width * height * depth;  
       }
       public static void main(String[] args) {  
           
           Box box = new Box(10, 20, 30);  
           System.out.print("The volume of Box is " + box.getVolume());  
      }  
} 
       