package com.exemplu.jdbc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MasinaJdbcDao {
  @Autowired
  JdbcTemplate jdbcTemplate;
  
public List<Masina> findAll(){
   String sql="select * from masini";
   return jdbcTemplate.query(sql, new MasinaMapper());
}

public Masina findById(int id){
  String sql="select * from masini where id=?";
  return jdbcTemplate.queryForObject(sql,new MasinaMapper(),id);
}

public int deleteById(int id){
  String sql="delete from masini where id=?";
  return jdbcTemplate.update(sql, id);
}

public int insert(Masina p){
  String sql="insert into masina values(?,?,?,?,?,?)";
  return jdbcTemplate.update(sql, p.getId(),p.getnrInmatriculare(),p.getMarca, p.getAnul(), p.getCuloare(), p.getNrkm);
}

public int update(Masina p){
    String sql = "update masini set nrInmatriculare=?, marca=?, anul=?, culoare=?, Nrkm=? where id=?";
    return jdbcTemplate.update(sql, p.getnrInmatriculare(), p.getMarca(), p.getAnul(), p.getCuloare(), p.getNrkm(), p.getId());
}
}
