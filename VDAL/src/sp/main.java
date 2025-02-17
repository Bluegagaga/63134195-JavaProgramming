package sp;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<SanPham>  dsSP;
		
		//Xin Mới
		dsSP = new ArrayList<SanPham>();
		
		//Nhập 3 sp
		SanPham sp1 = new SanPham(1, "Cầu", "Trái", "cau.png");
		SanPham sp2 = new SanPham(2, "Dừa", "Trái", "dua.png");
		SanPham sp3 = new SanPham(3, "Đủ", "Trái", "du.png");
		
		//Thêm vô arratlist
		dsSP.add(sp1);
		dsSP.add(sp2);
		dsSP.add(sp3);
		
		//In ra
//		for (SanPham x: dsSP )
//			System.out.println(x.toString());
		
		for (int i=0; i <dsSP.size(); i++ ) {
			SanPham sp = dsSP.get(i);
 			System.out.println(sp.toString());
		}
	}

}
