package truong_vu;

import java.util.Scanner;

import truong_vu.DSSanPham.DANHSACH10;
import truong_vu.Sanpham.Chitiet10;
//12
public class Chitiethoadon {
	public static class Chitiet12{
		private int maHoaDonn;
	    private int maSanPham;
	    private int soLuongmua;
	    private float donGia;
	    private float thanhTien;
		    
		  public Chitiet12() {}
		  
		  //private Chitiet10 chitiet10;
		  
		  public Chitiet12(int maHoaDonn,int maSanPham,int soLuong,float donGia,float thanhTien) {
			  this.maHoaDonn=maHoaDonn;
			  this.maSanPham=maSanPham;
			  this.soLuongmua=soLuong;
			  this.donGia=donGia;
			  this.thanhTien=thanhTien;
		  }
		  
		//
		  
		  public void nhap(){
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Nhập mã hóa đơn :");
		        maHoaDonn=sc.nextInt();
		        System.out.print("Nhập mã sản phẩm: ");
		        maSanPham = sc.nextInt();
		        System.out.print("Nhập số lượng mua: ");
		        soLuongmua = sc.nextInt();
		        System.out.println("");
//		      donGia = dienthoai.getDonGia();  
		        int masp = -1;
		        for (Chitiet10 ct : DANHSACH10.ct10) {
		            if (ct != null && ct.getMasanpham() == maSanPham) {
		                donGia = ct.getDongia();
		                masp = ct.getMasanpham();
		            }
		        }
		        if (masp != -1) {
		            System.out.println("Đơn giá: " + donGia);
		        } else {
		            System.out.println("Sản phẩm không tồn tại trong danh sách.");
		        }
		        //----------------------------------------------------
		        
		        for (Chitiet10 ct : DANHSACH10.ct10) {
		            if (ct != null && ct.getMasanpham() == maSanPham) {
		                thanhTien = ct.getDongia()*soLuongmua;
		                masp = ct.getMasanpham();
		            }
		        }
		        
		    }
		  
		  
		  
		  
		  public void xuat() {
	            System.out.println("===========================");
	            System.out.println("Mã hóa đơn: " + maHoaDonn);
	            System.out.println("Mã sản phẩm: " + maSanPham);
	            System.out.println("Số lượng mua: " + soLuongmua);

	            System.out.println("Đơn giá: " + donGia);
	            thanh_tien();
		  }
		
		  
		  
		public void thanh_tien() {
			float DonGia=0;
			int ma1=-1;// Giả sử giá trị mặc định nếu không có ma SP
			for(Chitiet10 ct : DANHSACH10.ct10) {
				if(ct!=null && ct.getMasanpham()==maSanPham) {
					 DonGia=ct.getDongia()*soLuongmua;
					ma1=ct.getMasanpham();
				}
			}
			if(ma1 != -1 ) {
				System.out.print("");
			}else {
				System.out.println("Đơn giá chưa có trong mục Sản phẩm");
			}
			System.out.println("thành tiền: "+DonGia );
		}
		

		public int getMaHoaDonn() {
			return maHoaDonn;
		}

		public void setMaHoaDonn(int maHoaDonn) {
			this.maHoaDonn = maHoaDonn;
		}

		public int getMaSanPham() {
			return maSanPham;
		}

		public void setMaSanPham(int maSanPham) {
			this.maSanPham = maSanPham;
		}

		public int getSoLuongmua() {
			return soLuongmua;
		}

		public void setSoLuongmua(int soLuongmua) {
			this.soLuongmua = soLuongmua;
		}

		/*public float getDonGia() {
			Chitiet10 ct =new Chitiet10();
			return ct.getDongia();
		}
*/
		public void setDonGia(float donGia) {
			this.donGia = donGia;
		}

		float getThanhTien() {
            //Chitiet10 ct = new Chitiet10();
            //return ct.getDongia() * soLuongmua;
			return this.thanhTien;
        }

		public float getDonGia() {
            return this.donGia; // Trả về giá trị của trường donGia
        }

		public void setThanhTien(float thanhTien) {
			this.thanhTien = thanhTien;
		}
		
		    
	}
	
	
}
