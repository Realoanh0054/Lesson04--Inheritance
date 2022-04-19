package advance.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConNguoi cns [] = new ConNguoi[5];
		Scanner sc = new Scanner(System.in);
		int flag;
		for (int i = 0; i < cns.length; i++) {
			System.out.println("Ban muon nhap sinh vien (0) / giao vien (1)");
			flag = sc.nextInt();
			sc.nextLine();
			if(flag == 0) {
				//Nhap sinh vien
				System.out.println("Nhap ten sinh vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi sinh vien");
				int old = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi sinh vien");
				String city = sc.nextLine();
				
				System.out.println("Nhap diem trung binh sinh vien");
				float dtb = sc.nextFloat();
				sc.nextLine();
				
				cns [i] = new SinhVien(name, old, city, dtb);
				
				
			}else {
				//Nhap giao vien
				System.out.println("Nhap ten giao vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi giao vien");
				int old = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi giao vien");
				String city = sc.nextLine();
				
				System.out.println("Nhap he so luong giao vien");
				float hsl = sc.nextFloat();
				sc.nextLine();
				
				cns [i] = new SinhVien(name, old, city, hsl);
			}			
		}
		print(cns);
	}
	
	static void print(ConNguoi cns[]) {
		for (int i = 0; i < cns.length; i++) {
			
		}
	}
}