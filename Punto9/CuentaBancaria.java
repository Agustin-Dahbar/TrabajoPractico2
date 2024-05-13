package Punto9;

import Punto2.Persona;

public class CuentaBancaria 
{
	private String CBU;	
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	
	//El constructor que usaremos para continuar el tp 9.
	public CuentaBancaria(String CBU, TipoCuenta tipo, Persona titular) 
	{
		this.CBU = CBU;
		this.tipo = tipo;
		this.titular = titular;
	}
	
	//Getter del CBU
	public String generarCBU() 
	{
		return CBU;
	}
	
	//Getter del saldo
	public double obtenerSaldo() 
	{
		System.out.println("Tu saldo actual es de $" + saldo);
		return saldo;
	}
	
	//Setter del saldo, le suma valor aceptando un deposito.
	public void depositar(double dineroRecibido) 
	{
		saldo += dineroRecibido;
		System.out.println("Realizaste un deposito de $" + dineroRecibido);
	}
	
	//Otro setter del saldo, pero ahora se extrae dinero de la cuenta.
	public void extraer(double dineroExtraido) 
	{
		if(dineroExtraido > saldo) //Si el retiro es mayor al saldo disponible.
		{
			System.out.println("No tienes fondos suficientes.");
		}
		else 
		{
			System.out.println("Realizaste una extracción de $" + dineroExtraido);
			saldo -= dineroExtraido;
		}
		
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

	
	
}
