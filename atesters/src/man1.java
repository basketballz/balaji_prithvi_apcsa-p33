 
 public void copy2(int x, int y, int w, int h){
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel currentPixel = null;
	  Pixel abovePixel = null;
	  for (int col = x; col < x + w; col++)
	    {
	      for (int row = y; row < y + h; row++)
	      {
	    	currentPixel = pixels[row][col];
	    	abovePixel = pixels[row - 1][col - 1];
	    	currentPixel.setBlue(currentPixel.getBlue() + (int) (0.5 * (currentPixel.getBlue() - abovePixel.getBlue())));
	    	currentPixel.setRed(currentPixel.getRed() +(int) (0.5 * (currentPixel.getRed() - abovePixel.getRed())));
	    	currentPixel.setGreen(currentPixel.getGreen() + (int) (0.5 * (currentPixel.getGreen() - abovePixel.getGreen())));
	    	if(currentPixel.getRed() > 255){
	    		currentPixel.setRed(255);
	    	}
	    	if(currentPixel.getBlue() > 255){
	    		currentPixel.setBlue(255);
	    	}
	    	if(currentPixel.getGreen() > 255){
	    		currentPixel.setGreen(255);
	    	}
	    	if(currentPixel.getRed() < 0){
	    		currentPixel.setRed(0);
	    	}
	    	if(currentPixel.getBlue() < 0){
	    		currentPixel.setBlue(0);
	    	}
	    	if(currentPixel.getGreen() < 0){
	    		currentPixel.setGreen(0);
	    	}
	      }
	    } 
 }
 
 public void copy2(int x, int y, int w, int h){
	  Pixel[][] pixels = this.getPixels2D();
	  for(int r=y; r<y+h; r++){
		  for(int c=x; c<x+w; c++){	
			  Pixel pixelObj = pixels[r][c];
			  int avgRed = ((
			  		  pixels[r-1][c-1].getRed() 
			  		+ pixels[r-1][c  ].getRed()
			  		+ pixels[r-1][c+1].getRed()
			  		+ pixels[r  ][c-1].getRed() 
			  		+ pixels[r  ][c+1].getRed()
			  		+ pixels[r+1][c-1].getRed()
			  		+ pixels[r+1][c  ].getRed() 
			  		+ pixels[r+1][c+1].getRed()
			  		)/8);
			  int avgGreen = ((
			  		  pixels[r-1][c-1].getGreen() 
			  		+ pixels[r-1][c  ].getGreen()
			  		+ pixels[r-1][c+1].getGreen()
			  		+ pixels[r  ][c-1].getGreen() 
			  		+ pixels[r  ][c+1].getGreen()
			  		+ pixels[r+1][c-1].getGreen()
			  		+ pixels[r+1][c  ].getGreen() 
			  		+ pixels[r+1][c+1].getGreen()
			  		)/8);
			  int avgBlue = ((
			  		  pixels[r-1][c-1].getBlue() 
			  		+ pixels[r-1][c  ].getBlue()
			  		+ pixels[r-1][c+1].getBlue()
			  		+ pixels[r  ][c-1].getBlue() 
			  		+ pixels[r  ][c+1].getBlue()
			  		+ pixels[r+1][c-1].getBlue()
			  		+ pixels[r+1][c  ].getBlue() 
			  		+ pixels[r+1][c+1].getBlue()
			  		)/8);
			  pixelObj.setRed(avgRed);
			  pixelObj.setGreen(avgGreen);
			  pixelObj.setBlue(avgBlue);
		  }
	  }
 }
 
//sharpen code , name in constructor and class, 
//testSharpen(50,50,500,400); runner


//method runner
  /*public static void testSharpen(int x, int y, int w, int h){
Picture redMoto = new Picture("redMotorcycle.jpg");
redMoto.explore();
redMoto.sharpen(x,y,w,h);
redMoto.explore();
}
*/

//CHROMAKEY
 //code
 public void chromakey(Picture newBack)
 {
 	  Pixel[][] toPixels = this.getPixels2D();
 	  Pixel[][] fromPixels = newBack.getPixels2D();
 	  for(int row = 0; row < toPixels.length; row++)
 	  {
 		  for(int col = 0; col < toPixels[0].length; col++)
 		  {
 			  int blue = toPixels[row][col].getBlue();
 			  int red = toPixels[row][col].getRed();
 			  int green = toPixels[row][col].getGreen();
 			  if(Math.sqrt((double)Math.pow(red, 2) + (double)Math.pow(green, 2)) <= (double)blue)
 			  {
 				  toPixels[row][col].setColor(fromPixels[row][col].getColor());
 			  }
 		  }
 	  }
 }
 
 //tester
 public static void testChromakey()
 {
	  Picture mark = new Picture ("src\\images\\blue-mark.jpg");
	  Picture moon = new Picture ("src\\images\\moon-surface.jpg");
	  mark.explore();
	  mark.chromakey(moon);
	  mark.explore();
	  
	  
 }

 
 
 //caller
 testChromakey();
 
 


//blur


//name in second constuctor

//two codes in tester
testBlur(190, 160, 20, 20, 10); test it out



private static void testBlur(int x, int y, int w, int h, int n) {
	  Picture redMoto = new Picture("redMotorcycle.jpg");
	  redMoto.explore();
	  for(int i=0; i<n; i++){
		  redMoto.blur(x,y,w,h);
	  }
	  redMoto.explore();
	  
	  
}


  