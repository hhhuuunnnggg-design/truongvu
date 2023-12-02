package truong_vu;

import java.util.Scanner;

//import truong_vu.DSSanPham.DANHSACH10;
import truong_vu.Nhanvien.Chitiet15;
//import truong_vu.Hoadon.Chitiet11;
//import truong_vu.DSHoaDon.DANHSACH11;

public class DSNhanVien {
	public class DANHSACH15{
		private static int n;
		static Chitiet15[] ct15;
		private static int max=50;
		
		static {
			n=0;
			ct15=new Nhanvien.Chitiet15[max];
		}
		
		public static void codecung (Chitiet15 ct)	{
			boolean dacomatrung=false;
			for(int i=0 ; i<n ; i++) {
				if (DANHSACH15.ct15[i]  != null && DANHSACH15.ct15[i].getManhanvien()== ct.getManhanvien()) {
					dacomatrung = true;
	                break;
	            }
			}
			if(!dacomatrung) {
				if(n<max) {
					DANHSACH15.ct15[n]=ct;
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
		public static void themds1(int choice) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("====================");
		    System.out.println("Mời bạn nhâp thông tin nhân viên");
		    Nhanvien nhanVien = new Nhanvien(); // Tạo đối tượng của lớp Nhanvien
		    Nhanvien.Chitiet15 newct1 = nhanVien.new Chitiet15(); // Sử dụng đối tượng Nhanvien để tạo Chitiet15
		    newct1.nhap();
		    
		    boolean kt = false;
		    for (int i = 0; i < n; i++) {
		        if (ct15[i] != null && ct15[i].getManhanvien() == newct1.getManhanvien()) {
		            kt = true;
		            break;
		        }
		    }

		    if (!kt) {
		        if (n < max) {
		            ct15[n] = newct1;
		            n++;
		            System.out.println("Đã thêm thành công");
		        } else {
		            System.out.println("Danh sách đã đầy");
		        }
		    } else {
		        System.out.println("Mã nhân viên đã tồn tại");
		    }
		}
		//----------------------------------------------------------------------
		/*public static void themds(int choice) {
			Scanner sc= new Scanner(System.in);
			System.out.println("==================");
			Chitiet15 newct =new Chitiet15();
			newct.nhap();
			boolean kt=false;
			for(int i=0 ; i<n ; i++) {
				if(ct15[i].getManhanvien()==newct.getManhanvien()) {
					//cai cu                 //cai moi
					kt=true;
					break;
				}
			}
			if(kt==false) {
				ct15[n]=newct;
				n++;
				System.out.println("Đã thêm thành công");
			}else {
				System.out.println("Phiếu nhập đã tồn tại");
			}
		}
		*/
		
		
		

		public static void xuatds() {
            for (int i = 0; i < n; i++) {
                ct15[i].xuat();
            }
        }
		
		public static void xoamanv() {
			Scanner sc=new Scanner(System.in);
			System.out.println("===================");
			System.out.println("Nhập mã Nhân viên bạn muốn xóa");
			int cc=sc.nextInt();
			boolean kt=false;
			for(int i=0 ; i<n ; i++) {
				if(ct15[i].getManhanvien()==cc) {
					for(int j=i ; j<n-1;j++) {
						ct15[j]=ct15[j+1];
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
		public static void xoatennv() {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("===================");
		    System.out.println("Nhập tên sản phẩm cần xóa");
		    String tenSPCanXoa = sc.nextLine();
		    boolean kt = false;

		    for (int i = 0; i < n; i++) {
		        if (ct15[i] != null && ct15[i].getTennhanvien().equalsIgnoreCase(tenSPCanXoa)) {
		            for (int j = i; j < n - 1; j++) {
		                ct15[j] = ct15[j + 1];
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
				xoamanv();
				break;
			case 2:
				xoatennv();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
            }
				
		}
		
		public static void tiemkiemmanv() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã nhân viên muốn tìm kiếm ");
	        Scanner sc = new Scanner(System.in);
	        int ma = sc.nextInt();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct15[i].getManhanvien() == ma) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct15[i].xuat();
	                break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy mã sản phẩm");
	        }
	    }
		public static void tiemkiemtennv() {
	        System.out.println("==================================");
	        System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
	        Scanner sc = new Scanner(System.in);
	        String ma1 = sc.nextLine();
	        boolean thayma = false;

	        for (int i = 0; i < n; i++) {
	            if (ct15[i].getTennhanvien() == ma1) {
	                System.out.println("Đã tìm thấy:");
	                thayma = true;
	                ct15[i].xuat();
	                break;
	            }
	        }

	        if (!thayma) {
	            System.out.println("Không tìm thấy tên của sản phẩm");
	        }
	    }
		
		public static void timkiemds() {
			System.out.println("====================");
			System.out.println("1.Tìm kiếm theo mã nhân viên");
			System.out.println("2.Tìm kiếm theo tên nhân viên");
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				tiemkiemmanv();
				break;
			case 2:
				tiemkiemtennv();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
            }
				
		}
		public static void thongKeTheoLuong() {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Nhập giới hạn lương từ:");
		    float luongDuoi = sc.nextFloat();
		    System.out.println("Nhập giới hạn lương đến:");
		    float luongTren = sc.nextFloat();
		    
		    System.out.println("===================");
		    System.out.println("Nhân viên có lương từ " + luongDuoi + " đến " + luongTren + ":");
		    
		    for (int i = 0; i < n; i++) {
		        if (ct15[i] != null && ct15[i].getLuongnhanvien() >= luongDuoi && ct15[i].getLuongnhanvien() <= luongTren) {
		            ct15[i].xuat();
		        }
		    }
		}

		public static void thongKeLuongCaoNhat() {
		    float luongCaoNhat = -1;
		    
		    for (int i = 0; i < n; i++) {
		        if (ct15[i] != null && ct15[i].getLuongnhanvien() > luongCaoNhat) {
		            luongCaoNhat = ct15[i].getLuongnhanvien();
		        }
		    }

		    System.out.println("===================");
		    System.out.println("Nhân viên có lương cao nhất:");
		    
		    for (int i = 0; i < n; i++) {
		        if (ct15[i] != null && ct15[i].getLuongnhanvien() == luongCaoNhat) {
		            ct15[i].xuat();
		        }
		    }
		}

		public static void thongkeds() {
			System.out.println("====================");
			System.out.println("1.Thống kê theo lương");
			System.out.println("2.Thống kê theo Lương cao nhất");
			
			Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1:
				thongKeTheoLuong();
				break;
			case 2:
				thongKeLuongCaoNhat();
				break;
			default:
				System.out.println("Vui lòng nhập lại");
				break;
            }
				
		}
		public static void suaThongTin() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập mã nhân viên bạn muốn sửa");
	        int maHD = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            if (ct15[i] != null && ct15[i].getManhanvien() == maHD) {
	                System.out.println("Nhập thông tin mới cho nhà cung cấp:");
	                ct15[i].nhap(); // Sử dụng phương thức nhap() của ct1[i] để nhập thông tin mới
	                System.out.println("Thông tin đã được cập nhật.");
	                return;
	            }
	        }
	        
	        System.out.println("Không tìm thấy nhà cung cấp có mã " + maHD);
	    }
		
		
	}
}
