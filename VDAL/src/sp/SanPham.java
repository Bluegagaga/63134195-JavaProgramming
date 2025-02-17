package sp;

public class SanPham {
	//Define properties
	int MaSP;
	String TenSP;
	String LoaiSP;
	String AnhSP; //only name/path
	//Constructors
	
	//Không tham số
//	public SanPham() {
//		//khởi tạo giá trị ban đầu các thuộc tính
//	}
	
	//Có tham số
//	public SanPham(int _MaSP, String _TenSP, String _LoaiSP, String _AnhSP) {
//		MaSP = _MaSP;
//		TenSP = _TenSP;
//		LoaiSP = _LoaiSP;
//		AnhSP = _AnhSP;
//	}
	
	//Có tham số
	public SanPham(int MaSP, String TenSP, String LoaiSP, String AnhSP) {
		this.MaSP = MaSP;
		this.TenSP = TenSP;
		this.LoaiSP = LoaiSP;
		this.AnhSP = AnhSP;
	}
	
	
	//getter, setter
	public int getMaSP() {
		return MaSP;
	}
	
	public void setMaSP(int MaSP) {
		this.MaSP = MaSP;
	}


	public String getTenSP() {
		return TenSP;
	}


	public void setTenSP(String tenSP) {
		this.TenSP = tenSP;
	}


	public String getLoaiSP() {
		return LoaiSP;
	}


	public void setLoaiSP(String loaiSP) {
		this.LoaiSP = loaiSP;
	}


	public String getAnhSP() {
		return AnhSP;
	}


	public void setAnhSP(String anhSP) {
		this.AnhSP = anhSP;
	}


	@Override
	public String toString() {
		return "SanPham [MaSP=" + MaSP + ", TenSP=" + TenSP + ", LoaiSP=" + LoaiSP + ", AnhSP=" + AnhSP + "]";
	}
	
	

}
