//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa do metodo main. ");
        a();
        System.out.println("Finalizou do prigrama do metodo main. ");


    }

    private static void a() {
        System.out.println("Iniciou o metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");

    }
    private static void b(){
        System.out.println("Iniciou o metodo b.");
        for(int i =0; i <=4; i ++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b.");
    }
    private static void c() {
        System.out.println("Iniciou o metodo c.");
        for(int i =4; i >=0; i --) System.out.println(i);
        System.out.println("Finalizou o metodo c.");

    }


}