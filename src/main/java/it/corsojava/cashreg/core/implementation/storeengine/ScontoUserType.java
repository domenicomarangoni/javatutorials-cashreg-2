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
import it.corsojava.cashreg.core.datatypes.specifici.Sconto;

public class ScontoUserType implements UserType{

	@Override
	public int[] sqlTypes() {
		return new int[] {Types.NUMERIC};
	}

	@Override
	public Class returnedClass() {
		return Sconto.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		Sconto a = null;
		Sconto b = null;
		try {
			a = (Sconto)x;
		}catch(Exception ex) {}
		try {
			b = (Sconto)y;
		}catch(Exception ex) {}
		if(x==null && y == null) return true;
		if(x==null || y == null) return false;
		return a.getValue()==b.getValue();
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, 
			SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		BigDecimal bd = rs.getBigDecimal(names[0]);
		return bd;		
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		if(Objects.isNull(value)) {
			st.setNull(index, Types.NUMERIC);
		}else {
			st.setBigDecimal(index, new BigDecimal(((Sconto)value).getValue()));
		}
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		if(value==null) return null;
		try {
			return new Sconto(((Sconto)value).getValue());
		}catch(PercOutOfRangeException poe) {
			throw new HibernateException(poe);
		}
	}

	@Override
	public boolean isMutable() {
		return true;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		return new BigDecimal(((Sconto)value).getValue());
	}

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		if(cached instanceof BigDecimal) {
			try {
				return new Sconto(((BigDecimal)cached).doubleValue());
			} catch (PercOutOfRangeException e) {
				return cached;
			}
		}
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		if(original==null)return null;
		Sconto s =(Sconto)original;
		try {
			Sconto t = new Sconto(s.getValue());
			target=t;
			return t;
		} catch (PercOutOfRangeException e) {
			return original;
		}
		
	}

}
