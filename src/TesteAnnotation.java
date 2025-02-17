import java.util.ArrayList;
import java.util.List;

public class TesteAnnotation {
    @Tabela("Nome da tabela")
    public static void main(String[] args) {
        Class classe = TesteAnnotation.class;

        TesteAnnotation tabela = new TesteAnnotation();

        Class Tab = tabela.getClass();

        List<String> nomeTabela = new ArrayList<>();
        nomeTabela.add("Nome da tabela");
        System.out.println(nomeTabela);
    }
}