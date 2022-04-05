import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descricao curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("curso Mentoria");
        mentoria.setDescricao("descricao mentoria");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java ddeveloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJean = new Dev();
        devJean.setNome("Jean");
        devJean.inscreverBootecamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jean:" + devJean.getConteudosInscritos());
        devJean.progredir();
        devJean.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jean:" + devJean.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jean:" + devJean.getConteudosConcluidos());
        System.out.println("XP:" + devJean.calcularTotalXp());

        System.out.println("-----------");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootecamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());

    }
}
