package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entity.ShohinEntity;

@Repository
public class ShohinRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ShohinEntity> selectAll() {
		// SQLの準備
		String sql = "SELECT * ";
		sql += "FROM shohin ";
		sql += "ORDER BY shohin_id;";
		
		List<ShohinEntity> list = jdbcTemplate.query(sql, new DataClassRowMapper<>(ShohinEntity.class));
		return list;
	}
}
