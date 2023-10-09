public class ExerciciosJava {
    public static void main (String[] args){
        float salarioJose = 1300f;
        float porcentagemFixa = 35f;
        float porcentagemDoSalarioValor = salarioJose * (porcentagemFixa / 100);
        System.out.println("pimeira é " +porcentagemDoSalarioValor);
        porcentagemFixa = 40;
        System.out.println("segunda é " +porcentagemFixa * salarioJose /100);


    }
}
