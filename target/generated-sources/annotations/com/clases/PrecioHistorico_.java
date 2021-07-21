package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PrecioHistorico.class)
public abstract class PrecioHistorico_ {

	public static volatile SingularAttribute<PrecioHistorico, Boolean> activoPrecioHistorico;
	public static volatile SingularAttribute<PrecioHistorico, Integer> idArticulo;
	public static volatile SingularAttribute<PrecioHistorico, Double> precio;
	public static volatile SingularAttribute<PrecioHistorico, Timestamp> fechaInicial;
	public static volatile SingularAttribute<PrecioHistorico, Timestamp> fechaFinal;
	public static volatile SingularAttribute<PrecioHistorico, Integer> idPrecioHistorico;

}

