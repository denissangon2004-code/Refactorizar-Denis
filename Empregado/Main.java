package Empregado;

public class Main{
    /**
     * @see  https://refactoring.guru/move-method
     */
    public static void main(String[] args) {

        // Crea un obxecto da clase CargoEmpregado para cada tipo de cargo
        cargoEmpregado empregado1 = new cargoEmpregado("Supervisor", 10);
        // cargoEmpregado empregado2 = new cargoEmpregado("Dependente", 2);
        // cargoEmpregado empregado3 = new cargoEmpregado("Pepe", 0);
        // Crea un obxecto da clase Empregado asignándolles o cargo correspondente
        Empregado mari = new Empregado("Dona Maria", 100, 2, empregado1);
        // Faino de tal xeito que deas executado:

        System.out.println(mari.getNome() + " ten un soldo de " + mari.getSoldo());
        // System.out.println(empregado2.getNome() + " ten un soldo de " + empregado2.getSoldo());
        // System.out.println(empregado3.getNome() + " ten un soldo de " + empregado3.getSoldo());

        //Comenta todo o código

    }
}