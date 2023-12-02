package truong_vu;

import java.util.Scanner;

public class MenuNhanVien {
	public static void main(String[] args) {
		 MenuNhanVien menu=new  MenuNhanVien ();
		 menu.startMenuNV();
	}
	public static void startMenuNV() {
		DSNhanVien.DANHSACH15.codecung(new Nhanvien().new Chitiet15(11, "Nguyễn", "Hùng", 15000000));

		// DSNhanVien.DANHSACH15.codecung(new Nhanvien.Chitiet15(11, "Nguyễn", "Hùng", 15000000));

		while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");//2 cái
            System.out.println("3. Tìm kiếm nhân viên");// 2 cái
            System.out.println("4. Xuất danh sách nhân viên");
            System.out.println("5. Thống kê "); // 2 cáci
            System.out.println("6. Sửa thông tin");
            System.out.println("7. Quay về màn hình chính ");
            System.out.println("0. Thoat");
            System.out.print("Chon thao tac: ");
            Scanner sc1 = new Scanner(System.in);
            int choice =sc1.nextInt();
            switch (choice) {
            case 1:
            	DSNhanVien.DANHSACH15.themds1(choice);        	
            	break;
            case 2:
            	DSNhanVien.DANHSACH15.xoads();
            	break;
            case 3:
            	DSNhanVien.DANHSACH15.timkiemds();
            	break;
            case 4:
            	DSNhanVien.DANHSACH15.xuatds();
            	break;
            case 5:
            	DSNhanVien.DANHSACH15.thongkeds();
            	break;
            case 6:
            	DSNhanVien.DANHSACH15.suaThongTin();
            	break;
            case 7:
            	tong.main(null);
            default:
            	System.out.println("Mời bạn nhập lại");
            }
}
		
		
	}
}
