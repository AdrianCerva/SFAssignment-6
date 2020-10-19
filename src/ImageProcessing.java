import acm.graphics.*;
import acm.program.*;
public class ImageProcessing extends GraphicsProgram {

	 private static GImage image = new GImage("Dirk_Luka.jpg", 0, 0);
     private static int counter;
	
	public void run(){
	     add(image);
	     
	     add(flipimage(image));
		
	}
	
	public GImage flipimage(GImage image) {
		
		int[][] arrey = image.getPixelArray();
		int[][] newArray = image.getPixelArray();
		
		int width = arrey.length;
		int height = arrey[0].length;
		
		for(int i = 0; i < width; i++) {
			counter = 0;
			
			for(int j = height - 1; j >=0; j--) {
				newArray[i][counter] = arrey[i][j];
				counter++;
			}
		}
		return new GImage(newArray, 300, 220);
	}
}
