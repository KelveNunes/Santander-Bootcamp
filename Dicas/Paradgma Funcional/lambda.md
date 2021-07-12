Funções lambda:
 
 ex:

interface função{
	String gerar(String valor);
}

função colocaPrefixoSenhorNaString = valor -> "Sr." + valor;
System.out.println(colocar colocaPrefixoSenhorNaString.gerar(valor: "joão"))
