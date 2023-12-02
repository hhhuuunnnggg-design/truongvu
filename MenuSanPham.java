package truong_vu;

import java.util.Scanner;

public class MenuSanPham {
public static void main(String[] args) {
	MenuSanPham menu=new MenuSanPham();
	menu.startMenuSP();
}
	public static void startMenuSP() {
		DSSanPham.DANHSACH10.codecung(new Sanpham.Chitiet10(11111, "oppo", 1000, 950000));
		DSSanPham.DANHSACH10.codecung(new Sanpham.Chitiet10(22222, "iphone 15", 1000, 50000000));
		DSSanPham.DANHSACH10.codecung(new Sanpham.Chitiet10(33333, "galaxy", 1000, 3000000));
		DSSanPham.DANHSACH10.codecung(new Sanpham.Chitiet10(44444, "nokia", 1000, 800000));
		DSSanPham.DANHSACH10.codecung(new Sanpham.Chitiet10(55555, "samsung", 1000, 7000000));
		 while (true) {
	            System.out.println("====Menu====");
	            System.out.println("1. Thêm sản phẩm");
	            System.out.println("2. Xoa nha cung cap");//2 cái
	            System.out.println("3. Tim kiem nha cung cap");// 2 cái
	            System.out.println("4. Xuất danh sách sản phẩm");
	            System.out.println("5. Thống kê "); // 2 cáci
	            System.out.println("6. Sửa thông tin");
	            System.out.println("7. Quay về màn hình chính ");
	            System.out.println("0. Thoat");
	            System.out.print("Chon thao tac: ");
	            Scanner sc = new Scanner(System.in);
	            int choice = sc.nextInt();
	            switch (choice) {
	            case 1:
	            	DSSanPham.DANHSACH10.themds(choice);
	            	break;
	            case 2:
	            	DSSanPham.DANHSACH10.xoads();
	            	break;
	            case 3:
	            	DSSanPham.DANHSACH10.timkiemds();
	            	break;
	            case 4:
	            	DSSanPham.DANHSACH10.xuatds();
	            	break;
	            case 5:
	            	DSSanPham.DANHSACH10.thongkeds();
	            	break;
	            case 6:
	            	DSSanPham.DANHSACH10.nnn();
	            	break;
	            case 7:
	            	tong.main(null);
	            default:
	            	System.out.println("Mời bạn nhập lại");
	            }
	}
}
}