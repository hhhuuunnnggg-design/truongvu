package truong_vu;

import java.util.Scanner;

//import doan_oop.tong;

public class MenuChiTietHoaDon {
	public static void main(String[] args) {
		 MenuChiTietHoaDon menu = new MenuChiTietHoaDon();
		 menu.menuCTHD();
	}
	
	
	public static void menuCTHD() {
		DSChiTietHoaDon.DANHSACH12.codecung(new Chitiethoadon.Chitiet12(1,11111,30,950000,28500000));
		DSChiTietHoaDon.DANHSACH12.codecung(new Chitiethoadon.Chitiet12(2,22222,10,50000000,70000000));
		DSChiTietHoaDon.DANHSACH12.codecung(new Chitiethoadon.Chitiet12(3,33333,15,3000000,105000000));
		DSChiTietHoaDon.DANHSACH12.codecung(new Chitiethoadon.Chitiet12(4,44444,17,800000,119000000));
		while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Them chi tiết hóa đơn");
            System.out.println("2. Xoa hoa don");//2
            System.out.println("3. Tim kiem hoa don");//2;
            System.out.println("4. Xuat danh sach hoa don");
            System.out.println("5. Thống kê ");
            System.out.println("6. Sửa thông tin");
            System.out.println("7. Quay ve man hinh chinh ");
            System.out.println("0. Thoat");
            System.out.print("Chon thao tac: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                	
                	DSChiTietHoaDon.DANHSACH12.themds(choice);
                    break;
                case 2:
                	DSChiTietHoaDon.DANHSACH12.xoads();;
                    break;
                case 3:
                	DSChiTietHoaDon.DANHSACH12.timkiemds();
                    break;
                case 4:
                	DSChiTietHoaDon.DANHSACH12.xuatds();
                    break;
                case 5:
                	DSChiTietHoaDon.DANHSACH12.thongkeds1();
                    break;
                case 6:
                	DSChiTietHoaDon.DANHSACH12.sua();
                    break;
                case 7:
                	tong.main(null);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
		
	}
	
}
