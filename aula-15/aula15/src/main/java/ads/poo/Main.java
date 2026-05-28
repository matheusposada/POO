package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // banco de dados = int
        // interface com o usuario = segunda-feira

//        String sigla = IO.readln("Entre com a sigla: ");
//        int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia de aula: "));
//        int dia2 = Integer.parseInt(IO.readln("Entre com o segundo dia de aula: "));
//
//        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(dia1);
//        DiaDaSemana segundo = DiaDaSemana.getByCodigo(dia2);
//
//
//        Disciplina disciplina = new Disciplina(sigla, new DiaDaSemana[]{primeiro, segundo});
//        IO.println(disciplina);


        int planeta = Integer.parseInt(IO.readln("Entre com a posição do planeta desejado "));

        SistemaSolar posicao = SistemaSolar.getByPosicao(planeta);

        IO.println(posicao);


    }
}

