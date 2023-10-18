package com.vti.frontend;

import com.vti.entity.INews;
import com.vti.entity.News;

public class Program2 {
	public static void main(String[] args) {
		News news = new News();
		news.setId(1);
		if(news instanceof INews) {
			System.out.println("Dung roi");
			
		}
		
	}

}
