package bai3chuong4;

public class Sinhvien {
    public String Fullname;
    public double diem;
    public Sinhvien (String Fullname,Double diem){
    this.Fullname = Fullname;
    this.diem = diem;
    }
    public String getFullname(){
    return Fullname;
    }
    public Double getdiem(){
        return diem;
    }
}