package SanPham;

public class main {

	public static void main(String[] args) {
		//Create SP
		SanPham sp1 = new SanPham(1,"Xiên Bẩn","Đồ Ăn","xb.png");
		SanPham sp2 = new SanPham(2, "Trà Đào", "Nước", "td.png");
		SanPham sp3 = new SanPham();
		sp3.setMaSP(3);
		sp3.setTenSP("Trà sữa");
		sp3.setLoaiSP("Nước");
		sp3.setAnhSP("ts.png");
		
		//In thông tin các sản phẩm
		String infoSP1 = sp1.toString();
		String infoSP2 = "\n Mã sản phẩm 2 là " + sp2.getMaSP();
			   infoSP2 += "\n Tên sản phẩm 2 là " + sp2.getTenSP();
		
		System.out.print(infoSP1);
		System.out.print(infoSP2);
	}

}
