package HW;
public class LabString {
    public static void main(String[] args) {
        
        String str = "C:/Users/HP/Pictures/myJpeg.jpeg";
        String extension = str.substring(str.lastIndexOf(".") + 1);
        String filename = str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf("."));
        String path = str.substring(0, str.lastIndexOf("/"));
        
        System.out.println("Extension = "+ extension);
        System.out.println("Filename = "+ filename);
        System.out.println("Path = "+ path);
            
    }
        
}