package truong_vu;


import java.util.Scanner;

import truong_vu.Chitiethoadon.Chitiet12;
import truong_vu.DSChiTietHoaDon.DANHSACH12;
import truong_vu.Hoadon.Chitiet11;

public class DSHoaDon {
	public static class DANHSACH11 {
		private static int n;
		private static Chitiet11[] ct11;
		private static int max=50;
		
		
		static {
			 n = 0;
			ct11 = new Chitiet11[max];
		}
		
	public static void codecung (Chitiet11 ct)	{
		boolean dacomatrung=false;
		for(int i=0 ; i<n ; i++) {
			if (DANHSACH11.ct11[i]  != null && DANHSACH11.ct11[i].getMaHoaDon() == ct.getMaHoaDon()) {
				dacomatrung = true;
                break;
            }
		}
		if(!dacomatrung) {
			if(n<max) {
				DANHSACH11.ct11[n]=ct;
				n++;
				System.out.println("đã thêm thành công");
			}else {
				System.out.println("Danh sách đã đầy");
				
			}	
		}
		else {
			System.out.println("Mã đã tồn tại");
		}
		}

	public static void xuatds() {
        for (int i = 0; i < n; i++) {
            ct11[i].xuat();
        }
    }
	
	/*public static void themds(int choice) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("====================");
    	Chitiet11 newct =new Chitiet11();
    	newct.nhap();
    	if(n==max) {
    		System.out.println("Danh sách đã đầy không thể thêm");
    	}
    	ct11[n]=newct;
    	n++;
    	System.out.println("Đã thêm thành công");
    }
	*/
	public static void themds(int choice) {
		Scanner sc= new Scanner(System.in);
		System.out.println("==================");
		Chitiet11 newct =new Chitiet11();
		newct.nhap();;
		boolean kt=false;
		for(int i=0 ; i<n ; i++) {
			if(ct11[i].getMaHoaDon()==newct.getMaHoaDon()) {
				//cai cu                 //cai moi
				kt=true;
				break;
			}
		}
		if(kt==false) {
			ct11[n]=newct;
			n++;
			System.out.println("Đã thêm thành công");
		}else {
			System.out.println("Phiếu nhập đã tồn tại");
		}
	}
	
	public static void xoahoadon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===================");
		System.out.println("Nhập mã hóa đơn cần xóa");
		int cc=sc.nextInt();
		boolean kt=false;
		for(int i=0 ; i<n ; i++) {
			if(ct11[i].getMaHoaDon()==cc) {
				for(int j=i ; i<n-1;j++) {
					ct11[j]=ct11[j+1];
				}
				n--;
				kt=true;
				System.out.println("Đã xóa thành công");
				break;
			}
		}
		if(!kt) {
			System.out.println("");
		}
	}
	public static void xoamakhachhang() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===================");
		System.out.println("Nhập mã hóa đơn cần xóa");
		int cc=sc.nextInt();
		boolean kt=false;
		for(int i=0 ; i<n ; i++) {
			if(ct11[i].getMaKhachHang()==cc) {
				for(int j=i ; i<n-1;j++) {
					ct11[j]=ct11[j+1];
				}
				n--;
				kt=true;
				System.out.println("Đã xóa thành công");
				break;
			}
		}
		if(!kt) {
			System.out.println("");
		}
	}
	
	public static void xoads() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=============");
		System.out.println("1.Xóa theo mã hóa đơn");
		System.out.println("2.Xóa theo mã khách hàng");
		int chon=sc.nextInt();
		
		switch (chon) {
		case 1: 
			xoamakhachhang();
			break;
		case 2:
			xoamakhachhang();
			break;
		default:
			System.out.println("Mời bạn nhập lại");
		}
	}
	
	public static void suaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn muốn sửa");
        int maHD = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (ct11[i] != null && ct11[i].getMaHoaDon() == maHD) {
                System.out.println("Nhập thông tin mới cho nhà cung cấp:");
                ct11[i].nhap(); // Sử dụng phương thức nhap() của ct1[i] để nhập thông tin mới
                System.out.println("Thông tin đã được cập nhật.");
                return;
            }
        }
        
        System.out.println("Không tìm thấy nhà cung cấp có mã " + maHD);
    }
    
	public static void tiemkiemHD() {
        System.out.println("==================================");
        System.out.print("Nhập mã hóa đơn cần tìm kiếm: ");
        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        boolean thayma = false;

        for (int i = 0; i < n; i++) {
            if (ct11[i].getMaHoaDon() == ma) {
                System.out.println("Đã tìm thấy:");
                thayma = true;
                ct11[i].xuat();
                break;
            }
        }

        if (!thayma) {
            System.out.println("Không tìm thấy mã nha cung cap");
        }
    }
	public static void tiemkiemNV() {
        System.out.println("==================================");
        System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        boolean thayma = false;

        for (int i = 0; i < n; i++) {
            if (ct11[i].getMaNhanVien() == ma) {
                System.out.println("Đã tìm thấy:");
                thayma = true;
                ct11[i].xuat();
                break;
            }
        }

        if (!thayma) {
            System.out.println("Không tìm thấy mã nha cung cap");
        }
    }
	 public static void timkiemtheomakhach() {
         System.out.println("==================================");
         System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
         Scanner sc = new Scanner(System.in);
         int ma = sc.nextInt();
         boolean thayma = false;

         for (int i = 0; i < n; i++) {
             if (ct11[i].getMaKhachHang() == ma) {
                 System.out.println("Đã tìm thấy:");
                 thayma = true;
                 ct11[i].xuat();
                 break;
             }
         }

         if (!thayma) {
             System.out.println("Không tìm thấy mã nha cung cap");
         }
     }
	public static void timkiemds() {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Tìm kiếm theo mã hóa đơn");
		System.out.println("2.Tìn kiếm theo mã nhân viên");
		System.out.println("3.Tìm kiếm theo mã Khách hàng");
		int chon=sc.nextInt();
		switch (chon) {
		case 1:
			tiemkiemHD();
			break;
		case 2:
			tiemkiemNV();
		case 3:
			timkiemtheomakhach();
		
		default:
			System.out.println("Mời nhập lại");
		}
	}
	
	/*public static void thongKeTongTien() {
	    float tongTien = 0;
	    for (int i = 0; i < n; i++) {
	        if (ct11[i] != null) {
	            tongTien += ct11[i].getTongTien();
	        }
	    }
	    System.out.println("Tổng tiền của tất cả hóa đơn: " + tongTien);
	}
	*/
	public static void thongKeTongTien1() {
	    float tongTien = 0;
	    for (Chitiet11 ct : DANHSACH11.ct11) {
	        if (ct != null) {
	            tongTien += ct.getTongTien();
	        }
	    }
	    System.out.println("Tổng tiền của tất cả hóa đơn: " + tongTien);
	}

	

	public static void thongKeSoLuongHoaDon() {
		
	    System.out.println("Số lượng hóa đơn trong danh sách: " + n);
	}
	
	public static void thongkeds() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Thống kê theo hóa đơn");
		//System.out.println("2.Thống kê theo tiền");
		int chon=sc.nextInt();
		switch (chon) {
		case 1:
			thongKeSoLuongHoaDon();
			break;
		/*case 2:
			thongKeTongTien2();
			break;
			*/
		default:
			System.out.println("Mời nhập lại");
		}
	}
	
	public static void thongKeTongTien2() {
	  System.out.println("======================");
	  int sum=0;
	  Scanner sc=new Scanner(System.in);
	  for(int i=0 ; i<n ; i++) {
		  sum+=ct11[i].getTongTien();
	  }
	  System.out.println("Tổng tiền tất cả các hóa đơn "+sum);
	}

	public static void thongKeTongTien3() {
	    System.out.println("=====================");
	    int sum = 0;

	    for (Chitiet11 ct11 : DANHSACH11.ct11) {
	        if (ct11 != null) {
	            for (Chitiet12 ct12 : DANHSACH12.ct12) {
	                if (ct12 != null && ct12.getMaHoaDonn() == ct11.getMaHoaDon()) {
	                    sum += ct12.getThanhTien();
	                }
	            }
	        }
	    }

	    System.out.println("Tổng tiền của tất cả mã hóa đơn: " + sum);
	}

	
	public static void nhay() {
		for(int i=0 ; i<n ; i++) {
			System.out.println("Tổng tiền: "+ct11[i].getTongTien());
		}
	}
	
	
}
	
	
	
	
		
}
