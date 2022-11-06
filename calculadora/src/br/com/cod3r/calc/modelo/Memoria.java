package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, SINAL, NUMERO, DIV, MULT, IGUAL, VIRGULA, SOMA, SUB
	};
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObserver> observadores = new ArrayList<>();
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
	private Memoria() {
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void setTextoAtual(String textoAtual) {
		this.textoAtual = textoAtual;
	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObserver(MemoriaObserver o) {
		observadores.add(o);
		
	}

	public void processarComando(String valor) {
		
		TipoComando tipoComando = detectarComando(valor);

		if (tipoComando == null) {
			return;
		}else if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		}else if(tipoComando == TipoComando.SINAL && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}else if(tipoComando == TipoComando.SINAL && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
		}else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? valor : textoAtual + valor;
			substituir = false;
		}else {
			substituir = true;
			textoAtual = obterResultado();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultado() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer, numeroAtual, resultado = 0;
		
		numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		}else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		}else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		}else if(ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}
		
		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
	}

	private TipoComando detectarComando(String valor) {
		
		if (textoAtual.isEmpty() && valor == "0") {
			return null;
		}
		
		try 
		{
			Integer.parseInt(valor);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {

			//Quando nao for numero
			if(valor.equals("AC")) {
				return TipoComando.ZERAR;
			}else if(valor.equals("-")) {
				return TipoComando.SUB;
			}else if(valor.equals("+")) {
				return TipoComando.SOMA;
			}else if(valor.equals("*")) {
				return TipoComando.MULT;
			}else if(valor.equals("/")) {
				return TipoComando.DIV;
			}else if(valor.equals("=")) {
				return TipoComando.IGUAL;
			}else if(valor.equals("±") && textoAtual != "") {
				return TipoComando.SINAL;
			}else if(valor.equals(",") && textoAtual != "") {
				return TipoComando.VIRGULA;
			}
			
			return null;
		} 
	
	
	
	}
	
	
	
	
	
}
