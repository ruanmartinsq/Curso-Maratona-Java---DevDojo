package academy.ruan.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public String nomeRelatorio;

    public static TipoCliente tipoClientePorNomeRelatorio (String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                //retorna array com todos os tipos clientes (PESSOA_FISICA e PESSOA_JURIDICA)
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
