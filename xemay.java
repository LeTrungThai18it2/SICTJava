# SICTJava
package quanlyxemay;

public class xemay {
	String hangxe;
	String mausac;
	String ngaynhaphang;
	int sluong;
	double dongia;
	public String getHangxe() {
		return hangxe;
	}
	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public String getNgaynhaphang() {
		return ngaynhaphang;
	}
	public void setNgaynhaphang(String ngaynhaphang) {
		this.ngaynhaphang = ngaynhaphang;
	}
	public int getSluong() {
		return sluong;
	}
	public void setSluong(int sluong) {
		this.sluong = sluong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public xemay(String hangxe,	String mausac, String ngaynhaphang, int sluong,	double dongia) {
		this.hangxe=hangxe;
		this.mausac=mausac;
		this.ngaynhaphang=ngaynhaphang;
		this.sluong=sluong;
		this.dongia=dongia;
	}
}
