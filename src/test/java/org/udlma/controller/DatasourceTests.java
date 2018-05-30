package org.udlma.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.udlma.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class DatasourceTests {
	
	@Autowired
	private DataSource ds;
	
	
	@Test
	public void testDataSource() throws Exception{
		
		Connection con = ds.getConnection();
		
		con.close();
		
	}

}
