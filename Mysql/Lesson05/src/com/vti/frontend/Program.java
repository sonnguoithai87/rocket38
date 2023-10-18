package com.vti.frontend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.News;

public class Program {
	public static List<News> lstNew;

	public static void main(String[] args) {
		lstNew = new ArrayList<News>();
		while (true) {

			ScannerUtils scUtil = new ScannerUtils();
			menu();
			int keyboard = scUtil.inputInt();
			if (keyboard == 1) {
				// Bat nguoi dung nhap cac thong tin nhuw ttile , autho..
				// day la 1 the hien
				News news = new News();
				String title = scUtil.inputName("Moi ban nhap title");
				news.setTitle("OK");
				int id = scUtil.inputId("Moi ban nhap id");
				news.setId(id);
				lstNew.add(news);
				int rate1 = scUtil.inputId("Moi ban nhap rate1");
				int rate2 = scUtil.inputId("Moi ban nhap rate2");
				int rate3 = scUtil.inputId("Moi ban nhap rate3");
				int[] rates = { rate1, rate2, rate3 };
				news.setRates(rates);

			} else if (keyboard == 2) {

				if (lstNew.size() > 0) {
					// in ra o
					lstNew.get(0).Display();
				} else {
					System.out.println("Khong co News nao!");
				}
			} else if (keyboard == 3) {
				if (lstNew.size() > 0) {
					// in ra o
					float avg = lstNew.get(0).Calculate();
					System.out.println("Trung binh:" + avg);
					lstNew.get(0).Display();
				} else {
					System.out.println("Khong co News nao!");
				}

			} else if (keyboard == 4) {// thoat
				System.out.println("Thoat");
				return;
			}
		}

	}

	public static void menu() {

		System.out.println("Chao mung ban den voi MyNews");
		System.out.println("Moi ban chon 1 trong cac chuc nang sau");
		System.out.println("1. InsertNew");
		System.out.println("2. ViewListNew");
		System.out.println("3. AverageRate");
		System.out.println("4. Exit");
	}

}
