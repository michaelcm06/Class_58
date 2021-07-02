public class App {
    public static void main(String[] args){

        int A=0;
        int B=0;
        int suma=0;

        System.out.print("\nPor favor, introduzca el valor de A:\t ");
        A=Integer.parseInt(System.console().readLine());
        System.out.print("\nPor favor, introduzca el valor de B:\t10");
        B=Integer.parseInt(System.console().readLine());

        suma=A+B;
        System.out.println(suma);
    }
}
