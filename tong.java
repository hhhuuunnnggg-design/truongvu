package truong_vu;

//import truong_vu.DSSanPham.DANHSACH10;

import java.util.Scanner;

//import truong_vu.DSChiTietHoaDon.DANHSACH12;
//import truong_vu.DSHoaDon.DANHSACH11;
public class tong {
	public static void main(String[] args) {
		//goitong cc;
		goitong.goi();
	}
}

class goitong {
	public static void goi() {
		//DANHSACH10 sp;
		//DANHSACH12 cthd;
		
		System.out.println("**************************");
		System.out.println("*    MÀN HÌNH CHÍNH      *");
		System.out.println("* 1. Chi tiết hóa đơn    *");
		System.out.println("* 2. Sản phẩm            *");
		System.out.println("* 3. Hóa dơn             *");
		System.out.println("  4. Nhân viên           *");
		System.out.println("*************************");
		
		Scanner sc = new Scanner(System.in);
		int chose=sc.nextInt();
		switch (chose) {
		case 1:
			MenuChiTietHoaDon.menuCTHD();
			break;
		case 2:
			MenuSanPham.startMenuSP();
			break;
		case 3:
			MenuHoaDon.MenuHD();
		case 4:
			MenuNhanVien.startMenuNV();
			break;
		default:
			System.out.println("Mời nhập lại");
		}
		
	}
}