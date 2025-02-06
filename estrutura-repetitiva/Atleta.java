import java.util.Scanner;

public class Atleta {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              String nome, sexo;
              String aux = null;
              double homem = 0;
              double mulher = 0;
              double altura;
              double peso = 0;
              double acumulador = 0;
              double mediaPeso = 0;
              double atletaMaisAlto = 1.0;
              double mediaMulher = 0.0;
              double auxF = 0.0;
      
      
              System.out.print("Qual a quantidade de atletas?  ");
              int quantidadeAtletas = scanner.nextInt();
      
              for (int i = 1; i <= quantidadeAtletas; i++) {
                  
                  System.out.printf("Digite os dados do %d º atleta: ", i);
                  scanner.nextLine();
                  nome = scanner.nextLine();
              
      
                  System.out.print("Sexo: ");
                  sexo = scanner.next();
                  if ((!sexo.equalsIgnoreCase("F")) && (!sexo.equalsIgnoreCase("M"))) {
                      System.out.print("Valor inválido! Favor digitar F ou M: ");
                      sexo = scanner.next();
                  }
      
                  if (sexo.equalsIgnoreCase("M")){
                      homem = homem + 1;
                  } 
                  if (sexo.equalsIgnoreCase("F")){
                      mulher = mulher + 1;
                  } 
      
                  System.out.print("Altura: ");
                  altura = scanner.nextDouble();
                  while (altura <= 0) {
                      System.out.print("Valor inválido! favor digitar um valor positivo: ");
                      altura = scanner.nextDouble();
                  }
      
                  if (altura > atletaMaisAlto){
                      atletaMaisAlto = altura;
                      aux = nome;
                  }else if(altura < atletaMaisAlto){
                      nome = aux;
                  }
      
                  if (sexo.equalsIgnoreCase("F")){
                      auxF = auxF + 1;
                      mediaMulher = mediaMulher + altura;
                  }
      
              
      
                  System.out.print("Peso: ");
                  peso = scanner.nextDouble();
                  while (peso <= 0) {
                      System.out.print("Valor inválido! favor digitar um valor positivo: ");
                      peso = scanner.nextDouble();
      
                  }
                  acumulador = acumulador + peso;
                  
                  
              }
               
          
              mediaPeso = acumulador / quantidadeAtletas;
      
              double porcentagemHomem = (homem * 100) / quantidadeAtletas;
              double porcentagemMulher = (mulher * 100) / quantidadeAtletas;
      
      
      
              System.out.println();
              System.out.println("RELATÓRIO: ");
              System.out.printf("Peso médio dos atletas: %.2f%n", mediaPeso);
              System.out.printf("Atleta mais alto: %s%n " ,aux);
              System.out.printf("Porcentagem de homens: %.1f %%%n ",porcentagemHomem);
              System.out.printf("Porcentagem de mulheres: %.1f %%%n ",porcentagemMulher);
              
              if (mediaMulher != 0) {
                  mediaMulher = mediaMulher / auxF;
                  System.out.printf("Altura média das mulheres: %.2f%n ",mediaMulher);
              }else 
                  System.out.println("Não há mulheres cadastradas.");

              scanner.close();
    }
}
