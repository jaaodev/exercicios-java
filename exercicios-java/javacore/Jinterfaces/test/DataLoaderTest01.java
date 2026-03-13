package javacore.Jinterfaces.test;

import javacore.Jinterfaces.domain.DataLoader;
import javacore.Jinterfaces.domain.DatabaseLoader;
import javacore.Jinterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
    /*
    A interface age como um contrato, onde as classes implementam o metodo dela.
    A interface por padrão tem todos os metodos como public abstract.
    Para criar uma interface você utiliza o nome public interface NomeDaInterface {}.
    Difrente de classes que você não pode adicionar mais de uma extensão, nas interfaces você pode adicionar várias implementações.
    Utilizar o default para implementar métodos que não são abstratos.
    private -> default -> protected -> public.
    Todos os atributos em uma intereface são constantes, ou seja por padrão todos já vem public static final ATRIBUTO;
    Você pode criar um metodo estatico, que não pode ser sobrescrito.
    Se eu quiser posso criar esse metodo estatico tanto na interface quanto na classe, o que eu nao consigo e sobrescrever ele por exemplo da interface pra classe.
     */
}
