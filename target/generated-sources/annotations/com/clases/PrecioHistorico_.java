package com.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PrecioHistorico.class)
public abstract class PrecioHistorico_ {

	public static volatile SingularAttribute<PrecioHistorico, Boolean> activoPrecioHistorico;
	public static volatile SingularAttribute<PrecioHistorico, Integer> idArticulo;
	public static volatile SingularAttribute<PrecioHistorico, Double> precio;
	public static volatile SingularAttribute<PrecioHistorico, String> fechaInicial;
	public static volatile SingularAttribute<PrecioHistorico, String> fechaFinal;
	public static volatile SingularAttribute<PrecioHistorico, Integer> idPrecioHistorico;

}

