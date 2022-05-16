public class Administrador extends Empregado {
    private double ajudaCusto;

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
    public void calcularSalario(){
        double salario;
        salario = getSalarioBase()-getImpostos()+ajudaCusto;
        System.out.println(salario);
    }
}