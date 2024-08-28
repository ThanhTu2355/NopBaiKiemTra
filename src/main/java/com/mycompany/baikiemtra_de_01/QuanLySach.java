/*
 */
package com.mycompany.baikiemtra_de_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class QuanLySach extends Sach{
    ArrayList<Sach> dssach = new ArrayList<>();
    
    public void nhapDanhSach(){
        dssach.add(new Sach("K011","Lap Trinh Java",95000,2017));
        dssach.add(new Sach("K012","Co So Du Lieu",85000,2001));
        dssach.add(new Sach("K013","Nhap Mon Lap Trinh",72000,2013));
        dssach.add(new Sach("K014","Lap Trinh Python",39000,2018));
        dssach.add(new Sach("K015","Lap Trinh C#",82000,2015));
    }
    public void xuatDanhSach() {
        for (Sach sach : dssach) {
            System.out.println(sach.toString());
        }
    }
    public double tinhTongGia(){
        double tong=0;
        for(Sach sach : dssach){
            tong+=sach.getGiaBia();
        }
        return tong;
    }
    public void laySachTruocNam(int nam){
        ArrayList<Sach> kq = new ArrayList<>();
        for (Sach sach : dssach) {
            if(sach.getNamXuatBan() < nam){
                System.out.println(kq);
            }
        }
    }
    public void timSachTheoTen(String ten){
        ArrayList<Sach> kq = new ArrayList<>();
        for (Sach sach : dssach) {
            if(sach.getTenSach().equalsIgnoreCase("Lap Trinh")){
                System.out.println(kq);
            }
        }
    }
    public void sapXepTang() {
        Comparator<Sach> cmp = new Comparator<Sach>() {
            @Override
            public int compare(Sach sach1, Sach sach2) {
                return Double.valueOf(sach1.getGiaBia()).compareTo(Double.valueOf(sach2.getGiaBia()));
            }
        };
        Collections.sort(dssach,cmp);
    }
}
