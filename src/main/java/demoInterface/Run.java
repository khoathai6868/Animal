package demoInterface;



public class Run {
    public static void main(String[] args) {
        ConCho c = new ConCho();
        c.an();
        c.chay();
        c.diChoi();
        c.ngu();
        c.sanMoi();
        c.ten = "lu lu";
        System.out.println(c.ten);
        c.tuoi = "7";
        System.out.println(c.tuoi);
        c.sinhSan();
        System.out.println(c.sinhSan);
        c.noDua();
        System.out.println(c.noDua);


        ConMeo m = new ConMeo();
        m.an();
        m.chay();
        m.diChoi();
        m.ngu();
    }
}
