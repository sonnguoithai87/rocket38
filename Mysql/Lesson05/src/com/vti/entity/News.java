package com.vti.entity;

public class News implements INews{
	
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] Rates = new int[3];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.printf("%s | %s |  %s | %.2f", this.title, this.publishDate, this.content, this.averageRate);
		
	}
	@Override
	public float Calculate() {
		// TODO Auto-generated method stub
		return this.averageRate = (Rates[0] + Rates[1] + Rates[2])/3;
		
	}
	public int[] getRates() {
		return Rates;
	}
	public void setRates(int[] rates) {
		Rates = rates;
	}
	


}
