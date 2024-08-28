/*
 */
package com.mycompany.baikiemtra_de_01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        QuanLySach qlSach = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Xuat toan bo sach va tong gia tri");
            System.out.println("2. Lay sach co nam xuat ban truoc 2015");
            System.out.println("3. Tim sach co ky tu dau la Lap trinh");
            System.out.println("4. Sap xep sach theo gia tang dan");
            System.out.println("5. Xoa theo ma sach");
            System.out.println("6. Sua gia bia theo ma sach");
            System.out.println("7. Tinh tong gia tri cua sach");
            System.out.print("Nhap chuc nang ban muon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            
            switch (luaChon) {
                case 0:
                    break;
                case 1:
                    qlSach.xuatDanhSach();
                    qlSach.tinhTongGia();
                    break;
                case 2:
                    qlSach.laySachTruocNam(2015);
                    break;
                case 3:
                    qlSach.timSachTheoTen("Lap Trinh");
                    break;
                case 4:
                    qlSach.sapXepTang();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    qlSach.tinhTongGia();
                    break;
                default:
                    System.out.println("Khong co chuc nang nay. Nhap lai");
            }
        } while (luaChon!=0);
    }
}
