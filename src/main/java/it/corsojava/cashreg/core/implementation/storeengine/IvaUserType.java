package it.corsojava.cashreg.core.implementation.storeengine;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import it.corsojava.cashreg.core.datatypes.base.PercOutOfRangeException;
import it.corsojava.cashreg.core.datatypes.specifici.Iva;
import it.corsojava.cashreg.core.datatypes.specifici.Sconto;

public class IvaUserType implements UserType{

	@Override
	public int[] sqlTypes() {
		return new int[] {Types.VARCHAR};
	}

	@Override
	public Class returnedClass() {
		return Iva.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		Iva  a = null;
		Iva b = null;
		try {
			a = (Iva)x;
		}catch(Exception ex) {}
		try {
			b = (Iva)y;
		}catch(Exception ex) {}
		if(x==null && y == null) return true;
		if(x==null || y == null) return false;
		return x.toString().equals(x.toString());
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		String iva = rs.getString(names[0]);
		return iva;
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		if(Objects.isNull(value)) {
			st.setNull(index, Types.VARCHAR);
		}else {
			st.setString(index, ((Iva)value).toString());
		}
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		return ((Iva)value).toString();
	}

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		if(cached instanceof Iva)
			return Iva.valueOf((String)cached);
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

}
