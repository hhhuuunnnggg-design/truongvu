package truong_vu;




import java.util.Date;
import java.util.Scanner;

import truong_vu.Chitiethoadon.Chitiet12;
import truong_vu.DSChiTietHoaDon.DANHSACH12;
import truong_vu.DSNhanVien.DANHSACH15;
import truong_vu.DSSanPham.DANHSACH10;
import truong_vu.Nhanvien.Chitiet15;
import truong_vu.Sanpham.Chitiet10;
import java.text.SimpleDateFormat;

public class Hoadon {
	public static class Chitiet11{  
    private int maHoaDon;
    private Date ngayLap;
    private int maNhanVien;
    private int maKhachHang;
    private float tongTien;
  
    public Chitiet11() {
    	
    }
    
    public Chitiet11 (int mahoadon,Date ngaylap,int manhanvien,int makhachhang,float tongtien) {
    	this.maHoaDon=mahoadon;
    	this.ngayLap=ngaylap;
    	this.maNhanVien=manhanvien;
    	this.maKhachHang=makhachhang;
    	this.tongTien=tongtien;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn");
        maHoaDon = sc.nextInt();
        nhapNgay();

        boolean manv;
        do {
            System.out.println("Nhập mã nhân viên");
            maNhanVien = sc.nextInt();
            manv = false;

            for (Chitiet15 ct15 : DANHSACH15.ct15) {
                if (ct15 != null && ct15.getManhanvien() == maNhanVien) {
                    manv = true;
                    break; // Thoát vòng lặp nếu tìm thấy mã nhân viên
                }
            }
            if (!manv) {
                System.out.println("Không có mã nhân viên này, mời nhập lại");
            }
        } while (!manv); // Lặp lại nếu mã nhân viên không hợp lệ

        System.out.println("Nhập mã khách hàng");
        maKhachHang = sc.nextInt();
        // Tính tổng tiền...
        tongTien = 0;
        for (Chitiet12 ct : DANHSACH12.ct12) {
            if (ct != null && ct.getMaHoaDonn() == maHoaDon) {
                tongTien += ct.getThanhTien();
            }
        }
    }

    
    /*
    private void tinhTongTien() {
        for (Chitiet12 ct : DANHSACH12.ct12) {
            if (ct != null && ct.getMaHoaDonn() == maHoaDon) {
                tongTien += ct.getThanhTien();
            }
        }
    }
*/
    
    private void nhapNgay() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Nhập ngày nhập (dd/mm/yy)");
    	String ngayNhap =sc.next();
    	try {
    		ngayLap=new SimpleDateFormat("dd/mm/yy").parse(ngayNhap);
		} catch (Exception e) {
			System.out.println("Lỗi định dạng");
		}
    }
    public void xuat() {
    	System.out.println("=====================");
    	System.out.println("Mã hóa đơn "+maHoaDon);
    	System.out.println("Ngày lập "+ngayLap);
    	System.out.println("Mã nhân viên "+maNhanVien);
    	System.out.println("Mã khách hàng "+maKhachHang);
    	System.out.println("Tổng tiền của quý khách ::"+tongTien);
    	test();
    }
 
    public void test() {
    	float sumtest=0;
    	for(Chitiet12 ct12: DANHSACH12.ct12) {
    		if(ct12 !=null && ct12.getMaHoaDonn()==maHoaDon) {
    			for(Chitiet10 ct10: DANHSACH10.ct10) {
    				if(ct10 !=null && ct10.getMasanpham()==ct12.getMaSanPham()) {
    					sumtest+=ct10.getDongia()*ct12.getSoLuongmua();
    				}
    			}
    		}
    	}
    	System.out.println("Tổng tiền mua là :"+sumtest);
    }
    
    
    /*
    public void xuatTongTien() {
        float tongTien = 0;
        for (Chitiet12 ct : DANHSACH12.ct12) {
            if (ct != null && ct.getMaHoaDonn() == maHoaDon) {
                tongTien += ct.getThanhTien();
            }
        }
        System.out.println("Tổng tiền của hóa đơn " + maHoaDon + ": " + tongTien);
    }
*/
    
	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	// chưa thỏa yêu cầu cho lắm
	public float getTongTien() {
		//float sum=0;
		//Chitiet12 chitiet= new Chitiet12();
		//sum+=chitiet.getThanhTien();
		return this.tongTien;
	}

	/*public float getTongTien() {
	 * 
	    return tongTien;
	}
*/
	
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	
    
    
	}
}