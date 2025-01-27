package functions;

public class area_of_rect {
    
    public static void CalculateArea(int length, int width){
        int area = length * width;
        System.out.println(area);
    }
    
    public static void Perimeter(int length, int width){
        int peri =  (length + width) * 2;
        System.out.println(peri);
    }
    
    
    public static void main(String[] args) {
        CalculateArea(5, 10);
        Perimeter(8, 4);
    }
}
