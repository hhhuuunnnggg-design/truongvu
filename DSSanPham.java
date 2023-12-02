package truong_vu;


import java.util.Scanner;
import truong_vu.Sanpham.Chitiet10;

public class DSSanPham {
	public static class DANHSACH10{
		private static int n;
		static Chitiet10[] ct10;
		private static int max=50;
		
		static {
			 n = 0;
			ct10 = new Sanpham.Chitiet10[max];
		}
		
		public static void codecung (Chitiet10 ct)	{
			boolean dacomatrung=false;
			for(int i=0 ; i<n ; i++) {
				if (DANHSACH10.ct10[i]  != null && DANHSACH10.ct10[i].getMasanpham() == ct.getMasanpham()) {
					dacomatrung = true;
	                break;
	            }
			}
			if(!dacomatrung) {
				if(n<max) {
					DANHSACH10.ct10[n]=ct;
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
		
		public static boolean kiemTraTrungMa(int ma) {
            for (int i = 0; i < n; i++) {
                if (ct10[i].getMasanpham() == ma) {
                    return true;
                }
            }
            return false;
        }
		
	
		 public static void themds(int choice) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("===================================");
		        System.out.println("Nhap thong tin sản phẩm : ");
		        Chitiet10 newct= new Chitiet10();
		        newct.nhap();
		        boolean kt = false;
		        for (int i = 0; i < n; i++) {
		            if (ct10[i].getMasanpham() == newct.getMasanpham()) {
		                kt = true;
		                break;
		            }
		        }
		        if (!kt) {
		            ct10[n] = newct;
		            n++;
		            System.out.println("Da them thanh cong!");
		        } else {
		            System.out.println("Ma nha cung cap da ton tai!");
		        }
		    }

		
		
		
		
		public static void xuatds() {
            for (int i = 0; i < n; i++) {
                ct10[i].xuat();
            }
        }
		
		//------------------------------------------
		public static void xoamasp() {
			Scanner sc=new Scanner(System.in);
			System.out.println("===================");
			System.out.println("Nhập mã sản phẩm");
			int cc=sc.nextInt();
			boolean kt=false;
			for(int i=0 ; i<n ; i++) {
				if(ct10[i].getMasanpham()==cc) {
					for(int j=i ; j<n-1;j++) {
						ct10[j]=ct10[j+1];
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
		
		public static void xoatensp() {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("===================");
		    System.out.println("Nhập tên sản phẩm cần xóa");
		    String tenSPCanXoa = sc.nextLine();
		    boolean kt = false;

		    for (int i = 0; i < n; i++) {
		        if (ct10[i] != null && ct10[i].getTensp().equalsIgnoreCase(tenSPCanXoa)) {
		            for (int j = i; j < n - 1; j++) {
		                ct10[j] = ct10[j + 1];
		            }
		            n--;
		            kt = true;
		            System.out.println("Đã xóa thành công");
		            break;
		        }
		    }

		    if (!kt) {
		        System.out.println("Không tìm thấy sản phẩm có tên: " + tenSPCanXoa);
		    }
		}


		public static void xoads() {
			System.out.println("====================");
			System.out.println("1.Xóa teo mã ");
			System.out.println("2.Xóa theo tên");
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				xoamasp();
				break;
			case 2:
				xoatensp();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
            }
				
		}
		
		
		public static void tiemkiemmasp() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
	        Scanner sc = new Scanner(System.in);
	        int ma = sc.nextInt();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct10[i].getMasanpham() == ma) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct10[i].xuat();
	                break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy mã sản phẩm");
	        }
	    }

		public static void tiemkiemtensp() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
	        Scanner sc = new Scanner(System.in);
	        String ma1 = sc.nextLine();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct10[i].getTensp() == ma1) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct10[i].xuat();
	                break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy tên của sản phẩm");
	        }
	    }
		
		public static void timkiemds() {
			System.out.println("====================");
			System.out.println("1.Tìm kiếm theo mã sản phẩm");
			System.out.println("2.Tìm kiếm theo tên sản phẩm");
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				tiemkiemmasp();
				break;
			case 2:
				tiemkiemtensp();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
            }
				
		}
		
		
		public static void suaThongTinds() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập mã sản phẩm muốn sửa");
	        int maHD = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            if (ct10[i] != null && ct10[i].getMasanpham() == maHD) {
	                System.out.println("Nhập thông tin mới cho nhà cung cấp:");
	                ct10[i].nhap(); // Sử dụng phương thức nhap() của ct1[i] để nhập thông tin mới
	                System.out.println("Thông tin đã được cập nhật.");
	                return;
	            }
	        }
	        
	        System.out.println("Không tìm thấy nhà cung cấp có mã " + maHD);
	    }
		
		
		
		
		
		
		
		
		
        public static void thongKeSoLuongSanPham() {
            System.out.println("Số lượng sản phẩm trong danh sách: " + n);
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
                if (ct10[i] != null && ct10[i].getDongia() >= gioiHanDuoi && ct10[i].getDongia() <= gioiHanTren) {
                    ct10[i].xuat();
                }
            }
        }
        
      /*  public static void thongKeTheoDonGia2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập giá trị đơn giá từ (A)->(B)");

            System.out.println("Nhập giới hạn dưới");
            int gioiHanDuoi = sc.nextInt();
            System.out.println("Nhập giới hạn trên");
            int gioiHanTren = sc.nextInt();
            
            System.out.println("===================");
            System.out.println("Sản phẩm có đơn giá từ " + gioiHanDuoi + " đến " + gioiHanTren + ":");

            for (Chitiet10 ct:DANHSACH10.ct10) {
                if (ct != null && ct.getDongia() >= gioiHanDuoi && ct.getDongia() <= gioiHanTren) {
                    ct.xuat();
                }
            }
        }

      */  

        
        public static void nnn() {
        	for(int i=0 ; i<n ; i++) {
        		System.out.println("nhay ne: "+ct10[i].getDongia());
        	}
        }
        
        public static void thongkeds() {
			System.out.println("====================");
			System.out.println("1.Thống kê theo số lượng sản phẩm");
			System.out.println("2.Thống kê theo đơn giá");
			
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				thongKeSoLuongSanPham();
				break;
			case 2:
				thongKeTheoDonGia();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
				break;
            }
				
		}
		
		
	}		
}
