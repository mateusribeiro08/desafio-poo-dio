import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de POO");
        curso1.setDescricao("Aprenda os conceitos de Programação Orientada a Objetos");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java");
        curso2.setDescricao("Aprenda os conceitos de Java");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de POO");
        mentoria.setDescricao("Tire suas dúvidas sobre Programação Orientada a Objetos");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de POO");
        bootcamp.setDescricao("Um bootcamp completo de Programação Orientada a Objetos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos de Mateus: " + devMateus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println("XP de Mateus: " + devMateus.calcularTotalXp());
        System.out.println("________________________________");
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("Conteúdos Inscritos de Mateus: " + devMateus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println("XP de Mateus: " + devMateus.calcularTotalXp());
        System.out.println("________________________________");
        System.out.println("Conteúdos Inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());
    }

        
}
