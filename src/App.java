import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de POO");
        curso1.setDescricao("Aprenda os conceitos de Programação Orientada a Objetos");
        curso1.setCargaHoraria(40);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java");
        curso2.setDescricao("Aprenda os conceitos de Java");
        curso2.setCargaHoraria(30);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de POO");
        mentoria.setDescricao("Tire suas dúvidas sobre Programação Orientada a Objetos");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
