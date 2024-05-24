import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Face> linkedd = new LinkedList<>();
        TND729 tnf=new TND729();
        tnf.NhapThongTin();
        tnf.Suathongtin(linkedd);
        tnf.ThemThongTin();
        tnf.XoaThongtin(linkedd);
    }
}