import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Conteudo curso3 = new Curso();
        curso3.setTitulo("Curso de PHP");
        curso3.setDescricao("Descrição do Curso de PHP");
        // curso3.setCargaHoraria(4); Do not exits in Conteudo
        System.out.println(curso3);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do curso de Java");
        mentoria1.setDescricao("Descrição da mentoria do curso de Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}
