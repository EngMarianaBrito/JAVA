import java.util.Scanner;

class Main {
  public static void main(String[] args) {}
     
  }
  
  public static void questao01(){
    //colhendo os valores
    Scanner valores = new Scanner (System.in);
    
    System.out.print("\nOlá!Informe o que se pede");
    
    System.out.print("-> Valor 1 = ");
    double valor1 = valores.nextDouble();
    
    System.out.print("-> Valor 2 = ");
    double valor2 = valores.nextDouble();

    //calculo
    double soma = valor1 + valor2;
    double subtracao =  valor1 - valor2;
    double multiplicacao = (valor1 * valor2);
    double divisao = (valor1 / valor2);
    
    //resultado
    System.out.print("-> Soma = " + soma); 
    System.out.print("-> Subtração = " + subtracao);
    System.out.print("-> Multiplicação = " + multiplicacao); 
    System.out.print("-> Divisão = " + divisao);
  }
  
  public static void questao03(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o nome do vendedor:");
    String nome = teclado.nextFloat();
    System.out.println("Informe o salário fixo do vendedor:");
    float salFixo = teclado.nextFloat();
    System.out.println("Informe o total de vendas do vendedor:");
    float totalMes = teclado.nextFloat();
    float salFinal;
    salFinal= salFixo + totalMes * 0.15;
    System.out.println("O vendedor: "+nome);
    System.out.println("Recebe um salário fixo de: "+salFixo);
    System.out.println("E um salário final de: "+salFinal);
  }
    
  public static void questao05(){
    float conversao;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe a quantidade de dólares disponíveis para conversão:");
    float qtdDolares = teclado.nextFloat();
    System.out.println("Informe a cotação do dólar em reais: ");
    float cotacaoDolar = teclado.nextFloat();
    conversao = cotacaoDolar * qtdDolares;
    System.out.println("Voçê tem o saldo de: R$"+ conversao);
  }

	public static void questao04(){
		Scanner temp = new Scanner(System.in);
		double celsius, fahren;
		System.out.print("Digite a temperatura em graus Celsius(°C): ");
		celsius = Double.parseDouble(temp.nextLine());
		fahren = ((9 * celsius) + 160) / 5;
		temp.close();
		System.out.println("A temperatura "+celsius+"°C equivale a "+fahren+"°F.");
	}
  public static void questao06(){
    final double juros = 0.007;
    double capitalFinal
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o capital investido:");
    double capital  = teclado.nextDouble();
    capitalFinal = juros * capital;
    System.out.println("O capital final após um mês é de:" + capitalFinal);
  }
	
	public static void questao02(){
		Scanner ler = new Scanner(System.in);
		double consumo, litros, distancia;
		System.out.print("Informe a quantidade de combustível (em L): ");
		litros = Double.parseDouble(ler.nextLine());
		System.out.print("Informe a distância percorrida (em km): ");
		distancia = Double.parseDouble(ler.nextLine());
		ler.close();
		consumo = distancia / litros;
		System.out.println("Seu consumo médio foi de "+consumo+" km/L.");
	}
	
   public static void questao07(){
     Scanner teclado = new Scanner (System.in);
     System.out.println("Informe o preço da compra:");
     float precoCompra = teclado.nextFloat();
     float prestacao;
     prestacao = precoCompra/5;
     System.out.println("Este é o valor de uma prestação:" +prestacao);
   }

  public static void questao08(){
   double precoProduto
   Scanner teclado = new Scanner(System.in);
   System.out.print("Informe o preço de custo do produto: ");
   double custo = teclado.nextDouble();
   System.out.print("Informe a margem de lucro em % : ");
   double margLucro = teclado.nextDouble();
   precoProduto = custo * (1 + margLucro/100);
   System.out.print("Informe a margem de lucro em % : ");


  }
  public static void questao09(){
   Scanner teclado = new Scanner (System.in);
   System.out.println("Informe o preço de fabrica do carro:");
   float precoFabrica = teclado.nextFloat();
   float precoPosImposto, precoFinal;
   precoPosImposto= precoFabrica  * 1.45;
   precoFinal = precoPosImposto * 1.28;
   System.out.println("Este é o preço final do carro:"+precoFinal); 
  }

	public static void questao14(){
		Scanner ler = new Scanner(System.in);
		int numero, antecessor, sucessor;
		System.out.print("Diga um número: ");
		numero = Integer.parseInt(ler.nextLine());
		ler.close();
		antecessor = numero - 1;
		sucessor = numero + 1;
		System.out.println("O antecessor de "+numero+" é "+antecessor+" e seu sucessor é "+sucessor+".");
	}

	public static void questao16(){
		int dias, meses, anos, dias_totais;
		Scanner ler = new Scanner(System.in);
		System.out.print("Vamos avaliar sua idade fornecida em anos, meses e dias. Primeiramente, quantos anos completos você tem? ");
		anos = Integer.parseInt(ler.nextLine());
		do {
			System.out.print("Agora, quantos meses completos você tem? ")
			meses = Integer.parseInt(ler.nextLine());
			if (meses > 11 || meses < 0){
				System.out.println("Resposta inválida. Tente novamente.")
			}
		} while (meses > 11 || meses < 0);
		do {
			System.out.print("Por fim, quantos dias completos você tem? ");
			dias = Integer.parseInt(ler.nextLine());
			if (dias > 29 || dias < 0){
				System.out.println("Resposta inválida. Tente novamente.")
			}
		} while (dia > 29 || dias < 0);
		ler.close();
		dias_completos = dias + (meses * 30) + (anos * 365);
		System.out.println("Sua idade total, em dias, equivale a "+dias_totais+".");
	}
	
   public static void questao15(){
    
    Scanner triangulo = new Scanner (System.in);

    System.out.print("\nOlá!Informe o que se pede");
    
    //colhendo valor da base e da altura
    System.out.print("-> Valor da base : ");
    double valor_base = valores.nextDouble();
    
    System.out.print("-> Valor da altura = ");
    double valor_altura = valores.nextDouble();
    
    //calculo
    double area = (valor_base * valor_altura) / 2 ;

    //resultado
    System.out.println("A area do triangulo é " + area);
  }

public static void questao21(){
   Scanner teclado = new Scanner (System.in);
   System.out.println("Informe o número");
   int numero = teclado.nextLine();
   if (numero > 10){
     System.out.println("É MAIOR QUE 10!");
   }
   else {
     System.out.println("É MENOR QUE 10!");
   }  
  }
  
    public static void questao19(){

    double percentDistribuidor = 0.28, impostos = 0.45, totalProduto;
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o custo do produto:");
    double custoProduto = teclado.nextDouble();
    totalProduto = (custoProduto * impostos) + (custoProduto *percentDistribuidor) + custoProduto;
    System.out.println("O preço final do produto é:"+totalProduto);
}
public static void questao20(){
		Scanner ler = new Scanner(System.in);
		double salario_fixo, comissao, valor_vendas, salario_final, parcela = 0.05;
		int carros_vendidos;
		System.out.print("Forneça o seu salário fixo: ");
		salario_fixo = Double.parseDouble(ler.nextLine());
		System.out.print("Forneça o total de carros vendidos: ");
		carros_vendidos = Integer.parseInt(ler.nextLine());
		System.out.print("Forneça o valor da sua venda: ");
		valor_vendas = Double.parseDouble(ler.nextLine());
		System.out.print("Quanto você recebe por carro vendido? ");
		comissao = DOuble.parseDouble(ler.nextine());
		ler.close();
		salario_final = salario_fixo + (comissao * carros_vendidos) + (total_vendas * parcela);
		System.out.println("O seu salário final é de R$"+salario_final+".");
	}
