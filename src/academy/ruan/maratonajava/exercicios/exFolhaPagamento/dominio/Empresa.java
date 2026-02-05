package academy.ruan.maratonajava.exercicios.exFolhaPagamento.dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public void removerFuncionario(int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                funcionarios.remove(i);
                System.out.println("Funcionário do ID " + id + " removido.");
                return;
            }
        }
        System.out.println("Nenhum funcionário encontrado com esse ID.");
    }

    public void listarFuncionarios() {
        System.out.println("=== LISTA DE FUNCIONÁRIOS ===");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public double calcularFolhaPagamentoTotal() {
        double total = 0;

        for (Funcionario f : funcionarios) {
            total += f.calcularSalarioTotal();
        }

        return total;
    }

    public void listarPorDepartamento(Departamento d) {
        System.out.println("\nFuncionários do departamento: " + d.getDescricao());

        for (Funcionario f : funcionarios) {
            if (f.getDepartamento() == d) {
                System.out.println(f);
            }
        }
    }

    public void listarPorCargo(Cargo c) {
        System.out.println("\nFuncionários com cargo: " + c);

        for (Funcionario f : funcionarios) {
            if (f.getCargo() == c) {
                System.out.println(f);
            }
        }
    }
}
