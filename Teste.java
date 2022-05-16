public class Teste {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        emp.setNome("José");
        emp.setEndereco("Rua Augusto 32");
        emp.setTelefone("123456");
        emp.setCodigoSetor(123);
        emp.setSalarioBase(1550.15);
        emp.setImpostos(40.15);
        System.out.println(emp.getNome());
        System.out.println(emp.getEndereco());
        System.out.println(emp.getTelefone());
        System.out.println(emp.getCodigoSetor());
        emp.calcularSalario();
        
        Operario ope = new Operario();
        ope.setNome("Diego");
        ope.setEndereco("Rua x 123");
        ope.setTelefone("367289");
        ope.setCodigoSetor(453);
        ope.setSalarioBase(1460.90);
        ope.setImpostos(5.90);
        ope.setComissao(340.00);
        System.out.println(ope.getNome());
        System.out.println(ope.getEndereco());
        System.out.println(ope.getTelefone());
        System.out.println(ope.getCodigoSetor());
        ope.calcularSalario();

        Administrador adm = new Administrador();
        adm.setNome("Maria");
        adm.setEndereco("Rua Y 23");
        adm.setTelefone("3454567");
        adm.setCodigoSetor(230);
        adm.setSalarioBase(6450.90);
        adm.setImpostos(65.90);
        adm.setAjudaCusto(250);
        System.out.println(adm.getNome());
        System.out.println(adm.getEndereco());
        System.out.println(adm.getTelefone());
        System.out.println(adm.getCodigoSetor());
        adm.calcularSalario();
    }
}