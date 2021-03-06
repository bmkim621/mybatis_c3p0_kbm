package kr.or.yi.mybatis_c3p0_kbm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_c3p0_kbm.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_kbm.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_kbm.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest extends AbstractTest {
	private static TitleDao titleDao = new TitleDaoImpl();

	@Test
	public void test01insertTitle() {
		log.debug("test01insertTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("인턴");
		
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);		
	}
	
	@Test
	public void test02selectTitleByAll() {
		log.debug("test02selectTitleByAll()");
		List<Title> titleList = titleDao.selectTitleByAll();
		Assert.assertNotNull(titleList);
	}
	
	@Test
	public void test03selectTitleByCode() {
		log.debug("test03selectTitleByCode()");
		Title title = new Title();
		title.setCode(5);
		Title searchTitle = titleDao.selectTitleByCode(title);
		log.debug("searchTitle : " + searchTitle);
		Assert.assertNotNull(searchTitle);
	}
	
	@Test
	public void test04updateTitle() {
		log.debug("test04updateTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("무기계약직");
		int res = titleDao.updateTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteTitle() {
		log.debug("test05deleteTitle()");
		int res = titleDao.deleteTitle(5);
		Assert.assertEquals(1, res);
	}

}
