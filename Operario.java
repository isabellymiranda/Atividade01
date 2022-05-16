public class Operario extends Empregado {
    private int valorProdução;
    private double comissao;
    public int getValorProdução() {
        return valorProdução;
    }
    public void setValorProdução(int valorProdução) {
        this.valorProdução = valorProdução;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void calcularSalario(){
        double salario;
        salario = getSalarioBase()-getImpostos()+comissao;
        System.out.println(salario);
    }
}