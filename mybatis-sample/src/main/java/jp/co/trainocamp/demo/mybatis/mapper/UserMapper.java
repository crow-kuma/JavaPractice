package jp.co.trainocamp.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.trainocamp.demo.mybatis.entity.MybatisUser;

@Mapper
public interface UserMapper {
	List<MybatisUser> selectAll();

	void update(MybatisUser user);

	void insert(MybatisUser user);
}
