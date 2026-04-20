package Empregado;

public class Empregado {
    private String nome;
    private int horas;
    private int horasextra;
    private cargoEmpregado cargo;

    public Empregado(String nome, int horas, int horasextra, cargoEmpregado cargo) {
        this.nome = nome;
        this.horas = horas;
        this.horasextra = horasextra;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    

    // Xenera automaticamente un Constructor

    // Xenera automaticamente os métodos get e set para cada atributo da clase

    public cargoEmpregado getCargo() {
        return cargo;
    }

    public void setCargo(cargoEmpregado cargo) {
        this.cargo = cargo;
    }

    // Despois de que funcione, refactoriza movendo o método calculoHoras() para que
    // sexa a clase CargoEmpregado quen calcule as horas, e non a clase Empregado
    public double calculoHoras() {
        if (cargo.getCargo().equals("Supervisor")) {
            return horas + horasextra * 2;
        }
        if (cargo.getCargo().equals("Dependente")) {
            return horas + horasextra * 1.5;
        }
        return horas + horasextra * 1.1;
    }

    public double getSoldo() {
        return cargo.geteurosPorHora() * calculoHoras();
    }

}