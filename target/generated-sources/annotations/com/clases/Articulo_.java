package com.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Articulo.class)
public abstract class Articulo_ {

	public static volatile SingularAttribute<Articulo, Integer> idArticulo;
	public static volatile SingularAttribute<Articulo, Integer> stockMinimo;
	public static volatile SingularAttribute<Articulo, String> descripcionArticulo;
	public static volatile SingularAttribute<Articulo, Boolean> activoArticulo;
	public static volatile SingularAttribute<Articulo, Integer> idTalla;
	public static volatile SingularAttribute<Articulo, Integer> stock;
	public static volatile SingularAttribute<Articulo, Integer> stockMaximo;
	public static volatile SingularAttribute<Articulo, Double> precioArticulo;
	public static volatile SingularAttribute<Articulo, String> nombreArticulo;

}

