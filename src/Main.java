import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java DIO");
        curso1.setCargaHoraria(8);

        Curso curso2 =new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso JavaScript DIO");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria do JavaScript");
        mentoria2.setDescricao("Descrição da mentoria JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
