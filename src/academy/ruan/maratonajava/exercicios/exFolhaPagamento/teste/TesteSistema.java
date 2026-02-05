package academy.ruan.maratonajava.exercicios.exFolhaPagamento.teste;

import academy.ruan.maratonajava.exercicios.exFolhaPagamento.dominio.*;

public class TesteSistema {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario(1, "Ruan", Cargo.PLENO, Departamento.TI, 10);
        Funcionario f2 = new Funcionario(2, "Marcos", Cargo.SENIOR, Departamento.MARKETING, 5);
        Funcionario f3 = new Funcionario(3, "Carlos", Cargo.ESTAGIARIO, Departamento.RH);
        Funcionario f4 = new Funcionario(4, "Clara", Cargo.GERENTE, Departamento.FINANCEIRO);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);
        empresa.adicionarFuncionario(f4);

        empresa.listarFuncionarios();

        empresa.listarPorDepartamento(Departamento.TI);
        empresa.listarPorCargo(Cargo.SENIOR);

        System.out.println("\nFolha de pagamento total: R$ " +
                empresa.calcularFolhaPagamentoTotal());

        System.out.println("\nTentando adicionar hora extra para estagiário:");

        try {
            f3.adicionarHorasExtras(5);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
