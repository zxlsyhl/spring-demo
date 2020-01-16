package org.zxl.springdemo.mvc.handlers;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.zxl.springdemo.mvc.enums.BaseEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class BaseEnumTypeHandler<E extends BaseEnum> extends BaseTypeHandler<E> {
	private Class<E> enumType;
	private Map<Integer, E> enumMap = new HashMap<Integer, E>();

	public BaseEnumTypeHandler(Class<E> type) {
		if (type == null)
			throw new IllegalArgumentException("Type argument cannot be null");
		this.enumType = type;

		E[] enums = enumType.getEnumConstants();
		if (enums == null)
			throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
		for (E e : enums) {
			enumMap.put(e.getSex(), e);
		}
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(i, parameter.getSex());
	}

	@Override
	public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return get(rs.getInt(columnName));
	}

	@Override
	public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return get(rs.getInt(columnIndex));
	}

	@Override
	public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return get(cs.getInt(columnIndex));
	}

	private E get(Integer v) {
		if (v == null) {
			return null;
		}

		return this.enumMap.get(v);
	}

}
