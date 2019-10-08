package demoInterface;

public class ConMeo implements NhungHanhViCuaDongVat {


    @Override
    public void an() {
        System.out.println("Con meo an com");
    }

    @Override
    public void ngu() {
        System.out.println("Con meo ngu tren cay");
    }

    @Override
    public void diChoi() {
        System.out.println("Con meo di choi");
    }

    @Override
    public void chay() {
        System.out.println("Con meo chay 4 chan");
    }
}
