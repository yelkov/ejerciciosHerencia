package ejercicioherencia;

public class A0Sub extends A0Super{
    @Override
    public void print() {
        super.print();
        System.out.println("Inside A0Sub.print()");
    }

    public void callOverridenPrint(){
        super.print();
    }
}
