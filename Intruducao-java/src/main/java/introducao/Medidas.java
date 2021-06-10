

// 1 do Pacote
package introducao;

// 2 Referenciar as bibliotecas


import java.util.Scanner;

// 3 clsses
public class Medidas {

    // atributos - caracteristicas

    // método ou função

    public static void main(String[] args) {

        // calculo de area  - exemplo: o tamanho do tapete ou piso.

        // utilizar a classe scanner para ler a escolha do usuário no console.

        Scanner scanner = new Scanner(System.in);

        System.out.println("O P Ç O Ê  S");

        System.out.println("C - Calcular área Modo Curto ");
        System.out.println("E - Calcular àrea Modo Extenso ");
        System.out.println("I - If simples ");
        System.out.println("D - Contar de 1 até 10");
        System.out.println("R - Contagem Regressiva");
        String opcao = scanner.next();

        //Condicional (IF = se). (switch = seleciona o comportamento do programa conforme a escolha do pessoa ou software )

        //String opcao = "melancia";

        switch (opcao) {

            case "i":
            case "I":
                System.out.println("você escolheu o método ifSimples");
                ifSimples();
                break;
            case "C":
            case "c":
                System.out.println("você escolheu o método compacto");
                calcularAreaModoCompacto();
                break;
            case "E":
            case "e":
                System.out.println("você escolheu o método extenso");
                calcularAreaModoExtenso();
                break;
            case "D":
            case "d":
                System.out.println("você escolheu contar ate dez");
                contarAteDez();
                break;
            case "R":
            case "r":
                System.out.println("você escolheu contagem regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("escolha uma opção válida");


        }


    }


    public static void ifSimples() {

        String modo = "extenso";

        if (modo == "compacto") {

            calcularAreaModoCompacto();
        } else {
            calcularAreaModoExtenso();

        }


    }

    public static void calcularAreaModoExtenso() {

        System.out.println("Calculo e áreas modo extenso!!");

        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 3;

        resultado = largura * comprimento;


        System.out.println("Para largura de " + largura + " e comprimento de " + comprimento + " a área é de " + resultado + "M2");
        System.out.println("área de " + resultado);

    }


    public static void calcularAreaModoCompacto() {

        System.out.println("Calculo e áreas modo compacto!!");

        int largura = 4;
        int comprimento = 3;


        System.out.println("para a largura de " + largura + " para o comprimento de " + comprimento + " resulta é: " + largura * comprimento + "M2");
        System.out.println("área de " + largura * comprimento);
    }

    public static void contarAteDez() {
//loop ou estrutura de repetição.
// for - repetição incondicional

        System.out.println("Contagem crescente");

        for (int numero = 1; numero <= 10; numero++) {

            System.out.println(numero);

        }
    }


    public static void contagemRegressiva() {
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--) {

            System.out.println(numero);

        }
    }
}


