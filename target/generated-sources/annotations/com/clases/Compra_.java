package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compra.class)
public abstract class Compra_ {

	public static volatile SingularAttribute<Compra, Double> totalCompra;
	public static volatile SingularAttribute<Compra, Timestamp> fechaRecibido;
	public static volatile SingularAttribute<Compra, Integer> idCompra;
	public static volatile SingularAttribute<Compra, Double> precioCompra;
	public static volatile SingularAttribute<Compra, Integer> idProveedor;
	public static volatile SingularAttribute<Compra, Timestamp> fechaPedido;
	public static volatile SingularAttribute<Compra, Integer> idEmpleados;

}

