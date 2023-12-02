package truong_vu;

import java.util.Scanner;

import truong_vu.Chitiethoadon.Chitiet12;

public class DSChiTietHoaDon {
    public static class DANHSACH12 {
        private static int n;
        static Chitiethoadon.Chitiet12[] ct12;
        private static int max = 50;

        static {
            n = 0;
            ct12 = new Chitiethoadon.Chitiet12[max];
        }

        public static void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số lượng chi tiết hóa đơn cần nhập: ");
            int soLuong = sc.nextInt();

            for (int i = 0; i < soLuong; i++) {
                Chitiethoadon.Chitiet12 chiTiet = new Chitiethoadon.Chitiet12();
                chiTiet.nhap();
                codecung(chiTiet);
            }
        }
        public static void them(int choice) {
            Chitiethoadon.Chitiet12 chiTiet = new Chitiethoadon.Chitiet12();
            chiTiet.nhap();
            codecung(chiTiet);
        }
        public static void themds(int choice) {
        	Scanner sc =new Scanner(System.in);
        	System.out.println("====================");
        	Chitiet12 newct =new Chitiet12();
        	newct.nhap();
        	if(n==max) {
        		System.out.println("Danh sách đã đầy không thể thêm");
        	}
        	ct12[n]=newct;
        	n++;
        	System.out.println("Đã thêm thành công");
        }
        

        
        static void sua() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã hóa đơn cần sửa chi tiết: ");
            int maHoaDon = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (ct12[i] != null && ct12[i].getMaHoaDonn() == maHoaDon) {
                    System.out.println("Nhập thông tin mới cho chi tiết hóa đơn:");
                    ct12[i].nhap();
                    System.out.println("Thông tin đã được cập nhật.");
                    return;
                }
            }

            System.out.println("Không tìm thấy mã hóa đơn.");
        }

        
        //--------------------------------------------------
        public static void xoamaHD() {
			Scanner sc=new Scanner(System.in);
			System.out.println("===================");
			System.out.println("Nhập mã hóa đơn muốn xóa");
			int cc1=sc.nextInt();
			boolean kt=false;
			for(int i=0 ; i<n ; i++) {
				if(ct12[i].getMaHoaDonn()==cc1) {
					for(int j=i ; j<n-1;j++) {
						ct12[j]=ct12[j+1];
					}
					n--;
					kt=true;
					System.out.println("Đã xóa thành công");
					break;
				}
			}
			if(!kt) {
				System.out.println("không tìm thấy");
			}
		}
        public static void xoamaSP() {
			Scanner sc=new Scanner(System.in);
			System.out.println("===================");
			System.out.println("Nhập mã hóa đơn muốn xóa");
			int cc=sc.nextInt();
			boolean kt=false;
			for(int i=0 ; i<n ; i++) {
				if(ct12[i].getMaSanPham()==cc) {
					for(int j=i ; j<n-1;j++) {
						ct12[j]=ct12[j+1];
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
			System.out.println("====================");
			System.out.println("1.Xóa teo mã Hóa Đơn ");
			System.out.println("2.Xóa theo mã sản phẩm");
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				xoamaHD();
				break;
			case 2:
				xoamaSP();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
            }
				
		}
        
        public static void tiemkiemmaCTHD() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
	        Scanner sc = new Scanner(System.in);
	        int ma = sc.nextInt();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct12[i].getMaHoaDonn() == ma) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct12[i].xuat();
	               // break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy mã sản phẩm");
	        }
	    }
        
        public static void tiemkiemmaspCTHD() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
	        Scanner sc = new Scanner(System.in);
	        int ma = sc.nextInt();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct12[i].getMaSanPham() == ma) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct12[i].xuat();
	                break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy mã sản phẩm");
	        }
	    }
        
        public static void timkiemds() {
			System.out.println("====================");
			System.out.println("1.Tìm kiếm theo mã CTHD");
			System.out.println("2. Tìm kiếm theo mã sản phẩm");
			
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				tiemkiemmaCTHD();
				break;
			case 2:
				tiemkiemmaspCTHD();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
				break;
            }
				
		}
        
        
        
        public static void thongketest() {
            Scanner sc = new Scanner(System.in);
            System.out.println("===================");
            System.out.println("Nhập mã chi tiết hóa đơn bạn muốn thống kê");
            int maHD = sc.nextInt();
            int sum = 0;
            boolean maHDTimThay = false;

            for (int i = 0; i < n; i++) {
                if (ct12[i].getMaHoaDonn() == maHD) {
                    sum += ct12[i].getSoLuongmua();
                    maHDTimThay = true;
                }
            }

            if (maHDTimThay) {
                System.out.println("Tổng số lượng của đơn hàng " + maHD + " là " + sum);
            } else {
                System.out.println("Không tìm thấy mã CTHĐ " + maHD);
            }
        }

        public static void thongKeTheoDonGia() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Nhập giá trị đơn giá từ (A)->(B)");
        	
        	System.out.println("Nhập giới hạn dưới");
        	int gioiHanDuoi=sc.nextInt();
        	System.out.println("Nhập giới hạn trên");
        	int gioiHanTren=sc.nextInt();
            System.out.println("===================");
            System.out.println("Sản phẩm có đơn giá từ " + gioiHanDuoi + " đến " + gioiHanTren + ":");
            
            for (int i = 0; i < n; i++) {
                if (ct12[i] != null && ct12[i].getDonGia() >= gioiHanDuoi && ct12[i].getDonGia() <= gioiHanTren) {
                    ct12[i].xuat();
                }
            }
        }
        public static void thongkeds1() {
			System.out.println("====================");
			System.out.println("1.Thống kê theo số lượng sản phẩm");
			System.out.println("2.Thống kê theo đơn giá");
			
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				thongketest() ;
				break;
			case 2:
				thongKeTheoDonGia();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
				break;
            }
				
		}
/*
        public static void thongKe() {
            // Thêm mã lệnh thống kê ở đây
            System.out.println("Danh sách chi tiết hóa đơn:");
            for (int i = 0; i < n; i++) {
                if (ct12[i] != null) {
                    ct12[i].xuat();
                }
            }
        }
   */     

        public static void xuatds() {
        	for (int i = 0; i < n; i++) {
                ct12[i].xuat();
            }
        }
        
        public static void codecung(Chitiethoadon.Chitiet12 ct) {
            boolean daCoMaTrung = false;
            for (int i = 0; i < n; i++) {
                if (ct12[i] != null && ct12[i].getMaHoaDonn() == ct.getMaHoaDonn()) {
                    daCoMaTrung = true;
                    break;
                }
            }
            if (!daCoMaTrung) {
                if (n < max) {
                    ct12[n] = ct;
                    n++;
                    System.out.println("Đã thêm thành công.");
                } else {
                    System.out.println("Danh sách đã đầy.");
                }
            } else {
                System.out.println("Mã đã tồn tại.");
            }
        }
        public static void nhay () {
        for(int i=0 ; i<n ; i++) {
        	System.out.println("nhay ra ne"+ct12[i].getThanhTien());
        }
    }
    }
}