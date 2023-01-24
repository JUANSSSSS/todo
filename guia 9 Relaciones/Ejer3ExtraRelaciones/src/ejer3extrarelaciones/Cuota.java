/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3extrarelaciones;


/**
 *
 * @author juanb
 */
class Cuota {
	private int numeroCuota;
	private double montoTotal;
	private boolean estaPagada;
	private String fechaVencimiento;
	private String formaPago;
	
	public Cuota(int numeroCuota, double montoTotal, boolean estaPagada, String fechaVencimiento, String formaPago) {
		this.numeroCuota = numeroCuota;
		this.montoTotal = montoTotal;
		this.estaPagada = estaPagada;
		this.fechaVencimiento = fechaVencimiento;
		this.formaPago = formaPago;
	}
	
        @Override
	public String toString() {
		return "Numero Cuota: " + numeroCuota + ", Monto Total: " + montoTotal + ", Esta Pagada: " + estaPagada + 
				", Fecha Vencimiento: " + fechaVencimiento + ", Forma de Pago: " + formaPago;
	}
}