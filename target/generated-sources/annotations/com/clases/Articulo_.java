package com.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Articulo.class)
public abstract class Articulo_ {

	public static volatile SingularAttribute<Articulo, Integer> IdArticulo;
	public static volatile SingularAttribute<Articulo, Integer> StockMaximo;
	public static volatile SingularAttribute<Articulo, Integer> IdTalla;
	public static volatile SingularAttribute<Articulo, Boolean> ActivoArticulo;
	public static volatile SingularAttribute<Articulo, String> NombreArticulo;
	public static volatile SingularAttribute<Articulo, Integer> StockMinimo;
	public static volatile SingularAttribute<Articulo, Double> PrecioArticulo;
	public static volatile SingularAttribute<Articulo, String> DescripcionArticulo;
	public static volatile SingularAttribute<Articulo, Integer> Stock;

}

