package kr.or.yi.mybatis_c3p0_kbm.dao;

import java.util.List;

import kr.or.yi.mybatis_c3p0_kbm.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	
	Title selectTitleByCode(Title title);
	
	int insertTitle(Title title);
	
	int deleteTitle(String code);
	
	int updateTitle(Title title);
}
