package academy.ruan.maratonajava.exercicios.exFolhaPagamento.dominio;

public enum Departamento {
    TI("Tecnologia da Informação"),
    RH("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    MARKETING("Marketing"),
    VENDAS("Vendas");

    private final String descricao;

    Departamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
