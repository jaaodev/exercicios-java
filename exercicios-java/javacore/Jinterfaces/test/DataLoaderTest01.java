package javacore.Jinterfaces.test;


import javacore.Jinterfaces.domain.DatabaseLoader;
import javacore.Jinterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
    /*
    A interface age como um contrato, onde as classes implementam o metodo dela.
    A interface por padrão tem todos os metodos como public abstract.
    Para criar uma interface você utiliza o nome public interface NomeDaInterface {}.
     */
}
