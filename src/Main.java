import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCanmp Java Developer");
        bootcamp.setDescricao("Descrição Java DEveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devrosa = new Dev();
        devrosa.setNome("Rosa");
        devrosa.inscreverBootcamp(bootcamp);
        System.out.println("Dev Rosa"+ devrosa.getConteudosInscritos());
        devrosa.progredir();
        devrosa.progredir();
        System.out.println("-------------");
        System.out.println("Dev Rosa"+ devrosa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rosa"+ devrosa.getConteudosConcluidos());
        System.out.println("XP "+devrosa.calcularTotalXp());

        System.out.println("----------------------");

        Dev devwendel = new Dev();
        devwendel.setNome("Wendel");
        devwendel.inscreverBootcamp(bootcamp);
        System.out.println("Dev Wendel"+ devwendel.getConteudosInscritos());
        devwendel.progredir();
        System.out.println("-");
        System.out.println("Dev Wendel"+ devwendel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Wendel"+ devwendel.getConteudosConcluidos());
        System.out.println("XP "+devwendel.calcularTotalXp());



    }
}
