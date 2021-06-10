// 1 do Pacote
package introducao;

// 2 Referenciar as bibliotecas


// 3 clsses
public class Medidas {

     // atributos - caracteristicas

    // método ou função

    public static void main(String [] args){

        // calculo de area  - exemplo: o tamanho do tapete ou piso.
     calcularAreaModoCompacto();
     CalcularAreaModoExtenso();



    }

    public static void CalcularAreaModoExtenso(){

    int largura;
    int comprimento;
    int resultado;

    largura = 5;
    comprimento = 3;

    resultado = largura * comprimento;

        System.out.println( "Calculo e áreas modo extenso!!");

        System.out.println("Para largura de " + largura + " e comprimento de " + comprimento + " a área é de " + resultado + "M2");
        System.out.println("área de " + resultado);

    }


public static void calcularAreaModoCompacto(){

        int largura = 4;
        int comprimento = 3;

    System.out.println( "Calculo e áreas modo compacto!!");

    System.out.println("para a largura de " + largura + " para o comprimento de " + comprimento + " resulta é: " + largura * comprimento + "M2"  );
   System.out.println("área de " + largura*comprimento);
}

}
