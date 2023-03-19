/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Admin
 */
public class mainnv {
    public static void main(String[] args) {
        nhanVienFulltime nv1 = new nhanVienFulltime();
        nhanVienParttime nv2=new nhanVienParttime();
        nv1.Nhap();
        nv1.Tinhluong();
        nv1.Xuatthongtin();
        nv2.Nhap();
        nv2.Tinhluong();
        nv2.Xuatthongtin();
        
    } 
}
