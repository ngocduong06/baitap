package Hinhhoc;
import Hinhhoc.hinhtron;
import Hinhhoc.hinhtru;
import Hinhhoc.hinhchunhat;
import Hinhhoc.hinhvuong;
public class main {
    public static void main(String[] args) {
        hinhtron Hinhtron = new hinhtron();
        Hinhtron.xuatten();
        Hinhtron.nhapbankinh();
        Hinhtron.tinhchuvi();
        Hinhtron.tinhdientich();
        Hinhtron.inchuvi();
        Hinhtron.indientich();
        hinhtru Hinhtru = new hinhtru();
        Hinhtru.xuatten();
        Hinhtru.nhapchieucao();
        Hinhtru.tinhthetich();
        Hinhtru.inthetich();
        hinhchunhat Hinhchunhat = new hinhchunhat();
        Hinhchunhat.xuatten();
        Hinhchunhat.nhapchieudai();
        Hinhchunhat.nhapchieurong();
        Hinhchunhat.tinhchuvi();
        Hinhchunhat.tinhdientich();
        Hinhchunhat.inchuvi();
        Hinhchunhat.indientich();
        hinhvuong Hinhvuong = new hinhvuong();
        Hinhvuong.xuatten();
        Hinhvuong.nhapcanh();
        Hinhvuong.dientich();
        Hinhchunhat.indientich();
    }
}
