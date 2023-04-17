/******************************************************************************

Implementare la classe conto corrente con le opportune variabili d'istanza e i seguenti metodi:
-deposita
-preleva
-saldo
-costruttore
Prevedere un sistema per il trasferimento dei fondi da un conto all'altro ( bonifico bancario)

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
    ContoCorrente contocorrenteProgno = new ContoCorrente ("IT42R0300203280694132312385", 50000);
    ContoCorrente contocorrenteProva = new ContoCorrente ("IT72D0300203280535891728952", 50000);
    contocorrenteProgno.prelievo();
	}
}
