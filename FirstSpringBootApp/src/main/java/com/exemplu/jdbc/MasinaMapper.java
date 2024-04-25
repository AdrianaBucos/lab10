package com.exemplu.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MasinaMapper implements RowMapper<Masina>{
   @Override
   public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
	    return new Masina(rs.getInt("id"), rs.getString("nrInmatriculare"), rs.getString("marca"), rs.getInt("anul"), rs.getString("culoare"), rs.getInt("Nrkm"));
	}
}
