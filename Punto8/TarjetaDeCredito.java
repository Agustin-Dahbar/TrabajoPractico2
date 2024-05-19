package Punto8;

public class TarjetaDeCredito 
{
	//Atributos privados
	private String numero;
	private String titular;
	private double limiteCompra;
	private double acumuladoActual;
	
	//Constructor parametrizado. Descarta un atributo.
	public TarjetaDeCredito(String numero, String titular, double limiteCompra) 
	{
		this.numero = numero;
		this.titular = titular;
		this.limiteCompra = limiteCompra;
		this.acumuladoActual = 0;
	}
	
	//Getters de los atributos (públicos)
	public String getNumero() 
	{
		return numero;
	}
	
	public String getTitular() 
	{
		return titular;
	}
	
	public double getLimiteCompra() 
	{
		return limiteCompra;
	}
	
	public double getAcumuladorActual() 
	{
		return acumuladoActual;
	}
	
	
	//Setters (privados)
	private void setNumero() 
	{
		this.numero = numero;
	}
	
	private void setTitular() 
	{
		this.titular = titular;
	}
	
	private void limiteCompra() 
	{
		this.limiteCompra = limiteCompra;
	}
	 
	//Metodo público que devuelve la diferencia entre el límite de compras y el acumulador actual de gastos
	//si este valor es inferior a 0 devuelve 0, por ejemplo si gastaste determinado monto 
	//y luego cambiaron el límite a un valor menor a este, el monto disponible debe ser 0.
	
	//Metodo que  nos indica cuando nos queda disponible del limite de compra.
	public double montoDisponible() 
	{
		double resultado = limiteCompra - acumuladoActual;
		
		//Si el resultado es número negativo, devolvemos 0.
		if(resultado < 0) 
		{
			return 0;
		}
		
		return resultado; //Si es mayor o igual a 0 devolvemos ese valor.
	}
	
	//Metodo que comprueba si el monto recibido puede usarse según el límite de compra permitido.
	private boolean compraPosible(double montoRecibido) 
	{
		if(limiteCompra >= montoRecibido) 
		{
			return true;
		}
		else // Se ejecutará solo cuando montoRecibido > limiteCompra. 
		{
			return false;
		}
	}
	
	//Metodo público que setea un nuevo limite de compra
	public void actualizarLimite(int nuevoLimite) 
	{
		this.limiteCompra = nuevoLimite;
	}
	
	//Metodo privado que recibe un importe a usar en la compra y lo suma a lo gastado actualmente.
	private void acumularGastoActual(double importeCompra)  
	{
		 acumuladoActual += importeCompra;
	}
	
	//Metodo público que nos dice si la compra puede realizarse según un presupuesto recibido. Si este es mayor al límite, no se puede.
	public boolean realizarCompra(double montoRecibido) 
	{
		if(montoRecibido < limiteCompra) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteCompra=" + limiteCompra
				+ ", acumuladoActual=" + acumuladoActual +"]";
	}
	
	
	
	
}
