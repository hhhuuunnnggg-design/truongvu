package truong_vu;

import java.util.Scanner;
import truong_vu.Chitiethoadon.Chitiet12;
import truong_vu.DSChiTietHoaDon.DANHSACH12;
//10
public class Sanpham {
	public static class Chitiet10{
		private int masanpham;
		private  String tensp;
		private int soluong;
		private int dongia;
		
		public Chitiet10() {}
		
		public Chitiet10(int masanpham, String tensp,int soluong,int dongia) {
			this.masanpham=masanpham;
			this.tensp=tensp;
			this.soluong=soluong;
			this.dongia=dongia;
		}
		
		 

		
		public void nhap() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhập mã sản phẩm");
			masanpham=sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập tên sản phẩm");
			tensp=sc.nextLine();
			System.out.println("Nhập số lượng kho");
			soluong=sc.nextInt();
			System.out.println("Nhập Đơn giá ");
			dongia=sc.nextInt();
		}
		public void xuat() {
			System.out.println("================================");
			System.out.println("Mã sản phẩm: "+masanpham);
			System.out.println("Tên sản phẩm: "+tensp);
			System.out.println("Số lượng sản phẩm trong kho: "+soluong);
			last();
			System.out.println("Đơn giá: "+dongia);
		}
	
		
		public void last() {
            int conlai = getSoluong();
            for (Chitiet12 ct : DANHSACH12.ct12) {
                if (ct != null && ct.getMaSanPham() == masanpham) {
                    conlai -= ct.getSoLuongmua();
                }
            }
            System.out.println("Số lượng còn lại trong kho: " + conlai);
        }
		
		public int getMasanpham() {
			return masanpham;
		}
		public void setMasanpham(int masanpham) {
			this.masanpham = masanpham;
		}
		public String getTensp() {
			return tensp;
		}
		public void setTensp(String tensp) {
			this.tensp = tensp;
		}
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public int getDongia() {
			return dongia;
		}
		public void setDongia(int dongia) {
			this.dongia = dongia;
		}
		
		
	}
	
}
