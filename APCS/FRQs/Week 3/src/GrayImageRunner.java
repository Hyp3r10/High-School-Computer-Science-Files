public class GrayImageRunner
{
	public static void main(String[] args)
	{
		int[][] a = {{255, 184, 178, 84, 129},
		             {84, 255, 255, 130, 84},
		             {78, 255, 0, 0, 78},
		             {84, 130, 255, 130, 84}};

		GrayImage image1 = new GrayImage(a);

		System.out.println(image1);

		System.out.println("=====================");
		System.out.println("Test countWhitePixels");
		System.out.println("=====================");
		System.out.println("count = " + image1.countWhitePixels());
		System.out.println();

		System.out.println();
		System.out.println("=====================");
		System.out.println("Test processImage");
		System.out.println("=====================");
		System.out.println();

		int[][] b = {{221, 184, 178, 84, 135},
             		 {84, 255, 255, 130, 84},
             	     {78, 255, 0, 0, 78},
             		 {84, 130, 255, 130, 84}};

		GrayImage image2 = new GrayImage(b);

		System.out.println("Original Image");
		System.out.println("--------------");
		System.out.println(image2);

		image2.processImage();

		System.out.println();
		System.out.println("Processed Image");
		System.out.println("---------------");
		System.out.println(image2);
	}
}