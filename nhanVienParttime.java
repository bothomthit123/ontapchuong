/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class nhanVienParttime extends nhanvien {
    public int giolamviec;

    public nhanVienParttime() {
    }

    
    
    public nhanVienParttime(int giolamviec, String ten) {
        super(ten);
        this.giolamviec = giolamviec;
    }
        public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ten nhan vien:");
        ten=sc.nextLine();
        System.out.print("Nhap vao luong nhan vien:");
        luong=sc.nextLong();
        System.out.print("Nhap vao gio lam viec:");
        giolamviec=sc.nextInt();
    }
    @Override
    public String loainhanvien(){
        return ten;
    }

    @Override
    public void Tinhluong(){
        int tinhluong=(int)luong * giolamviec;
        this.settinhluong(tinhluong);
    }
}
