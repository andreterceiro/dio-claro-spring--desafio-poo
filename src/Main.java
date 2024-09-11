import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("descrição do bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do dev André:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do dev André:" + devAndre.getConteudosConcluidos());
        devAndre.progredir();
        System.out.println("Conteúdos inscritos do dev André:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do dev André:" + devAndre.getConteudosConcluidos());
        System.out.println("Dev André - total XP: " + devAndre.calcularTotalXP());

        Dev devJulio = new Dev();
        devJulio.setNome("Júlio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do dev Júlio:" + devJulio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do dev Júlio:" + devJulio.getConteudosConcluidos());
        devJulio.progredir();
        devJulio.progredir();
        devJulio.progredir();
        devJulio.progredir();
        System.out.println("Conteúdos inscritos do dev Júlio:" + devJulio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do dev Júlio:" + devJulio.getConteudosConcluidos());
        System.out.println("Dev Júlio - total XP: " + devJulio.calcularTotalXP());

    }
}
