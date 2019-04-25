/*public void sharpen(int x, int y, int w, int h){
	  Pixel[][] pixels = this.getPixels2D();
	  for(int row = x; row < x+h; row++){
		  for(int col = y; col < y+w; col++){
			  pixels[row][col].setRed(pixels[row][col].getRed()+(pixels[row][col].getRed()-pixels[row-1][col-1].getRed())/2);
			  pixels[row][col].setBlue(pixels[row][col].getBlue()+(pixels[row][col].getBlue()-pixels[row-1][col-1].getBlue())/2);
			  pixels[row][col].setGreen(pixels[row][col].getGreen()+(pixels[row][col].getGreen()-pixels[row-1][col-1].getGreen())/2);
			  if(pixels[row][col].getRed()>255){
				  pixels[row][col].setRed(255);
			  }
			  if(pixels[row][col].getBlue()>255){
				  pixels[row][col].setBlue(255);
			  }
			  if(pixels[row][col].getGreen()>255){
				  pixels[row][col].setGreen(255);
			  }
			  if(pixels[row][col].getRed()<0){
				  pixels[row][col].setRed(0);
			  }
			  if(pixels[row][col].getBlue()<0){
				  pixels[row][col].setBlue(0);
			  }
			  if(pixels[row][col].getGreen()<0){
				  pixels[row][col].setGreen(0);
			  }
		  }
	  }
  }*/

//sharpen code , name in constructor, 
//testSharpen(50,50,500,400); runner


//method runner
  /*public static void testSharpen(int x, int y, int w, int h){
Picture redMoto = new Picture("redMotorcycle.jpg");
redMoto.explore();
redMoto.sharpen(x,y,w,h);
redMoto.explore();
}
*/





//blur
/*public void blur(int x, int y, int w, int h){
	  Pixel[][] pixels = this.getPixels2D();
	  for(int r=y; r<y+h; r++){
		  for(int c=x; c<x+w; c++){	//for every pixel in rectangle
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
  */

//name in second constuctor

//two codes in tester
testBlur(160, 190, 80, 80, 10);



private static void testBlur(int x, int y, int w, int h, int n) {
	  Picture redMoto = new Picture("redMotorcycle.jpg");
	  redMoto.explore();
	  for(int i=0; i<n; i++){
		  redMoto.blur(x,y,w,h);
	  }
	  redMoto.explore();
	  
	  
}


  