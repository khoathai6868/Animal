package demoInterface;

public class ConCho extends DongVat implements NhungHanhViCuaDongVat,NhungHanhViKhacCuaDongVat
{


    @Override
    public void an() {
        System.out.println("Con cho an com");
    }

    @Override
    public void ngu() {
        System.out.println("Con cho ngu duoi dat");
    }

    @Override
    public void diChoi() {
        System.out.println("Con cho khong di choi");
    }

    @Override
    public void chay() {
        System.out.println("Con cho chay 4 chan");
    }

    @Override
    public void noDua() {
        System.out.println("Con cho no dua");
    }

    @Override
    public void sinhSan() {
        System.out.println("Con cho sinh san");
    }
}
