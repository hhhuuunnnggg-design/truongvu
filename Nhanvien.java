package truong_vu;

import java.util.Scanner;


public class Nhanvien {
	public class Chitiet15{
		private int manhanvien;
		private String honhanvien;
		private String tennhanvien;
		private float luongnhanvien;
		
		public Chitiet15() {}
		
		public Chitiet15(int manhanvien,String honhanvien,String tennhanvien,float luongnhanvien) {
			this.manhanvien=manhanvien;
			this.honhanvien=honhanvien;
			this.tennhanvien=tennhanvien;
			this.luongnhanvien=luongnhanvien;
		}
		public void nhap() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhập mã nhân viên");
			manhanvien=sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập họ nhân viên");
			honhanvien=sc.nextLine();
			System.out.println("Nhập tên nhân viên");
			tennhanvien=sc.nextLine();
			//sc.nextFloat();
			System.out.println("Nhập lương nhân viên");
			luongnhanvien=sc.nextFloat();
		}
		public void xuat() {
			System.out.println("=================================");
			System.out.println("Mã nhân viên: "+manhanvien);
			System.out.println("Họ của nhân viên: "+honhanvien);
			System.out.println("Tên của nhân viên: "+tennhanvien);
			System.out.println("Lương của nhân viên: "+luongnhanvien);
		}

		public int getManhanvien() {
			return manhanvien;
		}

		public void setManhanvien(int manhanvien) {
			this.manhanvien = manhanvien;
		}

		public String getHonhanvien() {
			return honhanvien;
		}

		public void setHonhanvien(String honhanvien) {
			this.honhanvien = honhanvien;
		}

		public String getTennhanvien() {
			return tennhanvien;
		}

		public void setTennhanvien(String tennhanvien) {
			this.tennhanvien = tennhanvien;
		}

		public float getLuongnhanvien() {
			return luongnhanvien;
		}

		public void setLuongnhanvien(float luongnhanvien) {
			this.luongnhanvien = luongnhanvien;
		}
		
	}
}
