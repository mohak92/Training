package com.training.shapes;

public class Rectangle {

		private int width;
		private int height;
		private int area;
		
		public void setDimentions (int obj_width, int obj_height){
			width = obj_width;
			height = obj_height;
			area = width * height;
		}
		
		public int getArea(){
			return area;
		}
		
	
}
