# SICTJava
package quanlyxemay;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;


public class quanlyxemay {
	Vector list = new Vector();
	public quanlyxemay()
	{
		while(true)
		{
			System.out.println("");
			System.out.println("----Quan ly xe may----");
			System.out.println("1. Nhap hang");
			System.out.println("2. Xem hang");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		xemay a ;
		System.out.println("Nhap so luong xe may = ");
		n =key.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Nhap hang xe:");
			key.nextLine();
			String loaigiay=key.nextLine();
			System.out.println("Nhap mau sac: ");
			String color=key.nextLine();
			System.out.println("Ngay nhap hang: ");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String ngaynhaphang=key.nextLine();
			System.out.println("Nhap so luong: ");
			int sluong=key.nextInt();
			System.out.println("Nhap don gia: ");
			double dongia=key.nextDouble();
			a= new xemay(loaigiay,color,ngaynhaphang,sluong,dongia);
			list.add(a);
		}
	}
	public void InTT() {
		Enumeration xemays = list.elements();
		int i=1;
		while(xemays.hasMoreElements()) {
			xemay xe = (xemay)xemays.nextElement();
			System.out.println("Hang xe la: "+xe.getHangxe()+" va mau sac cua xe la: "+xe.getMausac());
		   }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new quanlyxemay();
	}

}
