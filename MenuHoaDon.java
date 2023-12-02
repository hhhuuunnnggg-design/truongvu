package truong_vu;
import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;

public class MenuHoaDon {
    private static DSHoaDon.DANHSACH11 dsHoaDon = new DSHoaDon.DANHSACH11();

    public static void main(String[] args) {
        MenuHoaDon menu = new MenuHoaDon();
        menu.MenuHD();
    }

    public static void MenuHD() {
    	DSHoaDon.DANHSACH11.codecung(new Hoadon.Chitiet11(1, new Date(), 165, 165, 28500000));
    	//DSHoaDon.DANHSACH11.codecung(new Hoadon.Chitiet11(2, new Date(), 22222,10 , 70000000));
    	//DSHoaDon.DANHSACH11.codecung(new Hoadon.Chitiet11(3, new Date(), 33333,15 , 105000000));
    	//DSHoaDon.DANHSACH11.codecung(new Hoadon.Chitiet11(4, new Date(), 44444,17 ,119000000 ));
    	while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Them hoa don");
            System.out.println("2. Xoa hoa don");
            System.out.println("3. Tim kiem hoa don");
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
                	
                	DSHoaDon.DANHSACH11.themds(choice);// 1 cái
                    break;
                case 2:
                	DSHoaDon.DANHSACH11.xoads();// 2 cái(xóa theo đơn, xóa theo khách)
                    break;
                case 3:
                	DSHoaDon.DANHSACH11.timkiemds();// 3 tìm kiếm(hóa đơn, nhân viên, khách hàng)
                    break;
                case 4:
                	DSHoaDon.DANHSACH11.xuatds();
                    break;
                case 5:
                	DSHoaDon.DANHSACH11.thongkeds();//1.số đơn.     tổng tiền (sai)
                    break;
                case 6:
                	DSHoaDon.DANHSACH11.nhay();;//1 cái
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
