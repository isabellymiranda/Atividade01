public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double impostos;

    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getImpostos() {
        return impostos;
    }
    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }
    public void calcularSalario(){
        double salario;
        salario = salarioBase-impostos;
        System.out.println(salario);
    }
}

