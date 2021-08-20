package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venta.class)
public abstract class Venta_ {

	public static volatile SingularAttribute<Venta, Double> total;
	public static volatile SingularAttribute<Venta, Integer> idEstado;
	public static volatile SingularAttribute<Venta, Double> impuesto;
	public static volatile SingularAttribute<Venta, Double> MontoTarjeta;
	public static volatile SingularAttribute<Venta, Integer> idCliente;
	public static volatile SingularAttribute<Venta, String> Tarjeta;
	public static volatile SingularAttribute<Venta, Integer> idParametros;
	public static volatile SingularAttribute<Venta, Integer> idTipoDePago;
	public static volatile SingularAttribute<Venta, Double> subTotal;
	public static volatile SingularAttribute<Venta, Integer> idEmpleados;
	public static volatile SingularAttribute<Venta, Integer> idVenta;
	public static volatile SingularAttribute<Venta, Timestamp> fechaVenta;

}

