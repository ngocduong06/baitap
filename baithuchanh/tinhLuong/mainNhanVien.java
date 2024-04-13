package tinhLuong;

public class mainNhanVien {
    public static void main(String[] args) {
        
    NhanvienFullTime sep = new NhanvienFullTime("TRAN NGOC DUONG");
    sep.loaiNhanVien(); 
    sep.setLoaiChucVu(configs.nhanvienSep);
    sep.tinhLuong();
    sep.xuatThongTin();
    NhanvienFullTime linh0 = new NhanvienFullTime("TRAN VAN B");
    linh0.setLoaiChucVu(configs.nhanvienLinh);
   linh0.tinhLuong();
   linh0.xuatThongTin();
    NhanvienFullTime linh1 = new NhanvienFullTime("NGUYEN THE VINH", 5);
    linh1.loaiNhanVien();
    linh1.setLoaiChucVu(configs.nhanvienLinh);
    linh1.tinhLuong();
    linh1.xuatThongTin();
    nhanvienPartTime linh2 = new nhanvienPartTime("NGUYEN VAN A", 200);
    linh2.loaiNhanVien();
    linh2.tinhLuong();
    linh2.xuatThongTin();
}                                
          }
