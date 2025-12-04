package academy.ruan.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //private -> default(quando nao se poe nada) -> protected -> public
    //se na classe super estiver protected so posso usar public, se tiver default protected e public

    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes!! ");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro retrieveMaxDataSize na interface");
    }
}
