/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.makotojava.ncaabb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.makotojava.ncaabb.model.SeasonData;
import com.makotojava.ncaabb.springconfig.ApplicationConfig;

public class SeasonDataJdbcDaoTest {
  
  private static final Logger log = Logger.getLogger(SeasonDataJdbcDaoTest.class);
  
  private ApplicationContext applicationContext;
  private SeasonDataDao classUnderTest;
  
  @Before
  public void setUp() throws Exception {
    applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    classUnderTest = applicationContext.getBean(SeasonDataDao.class);
  }

  @Test
  public void testFetchAllByYear_2011() {
    log.info("*** BEGIN Test ***");
    Integer year = 2011;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2012() {
    log.info("*** BEGIN Test ***");
    Integer year = 2012;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2013() {
    log.info("*** BEGIN Test ***");
    Integer year = 2013;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2014() {
    log.info("*** BEGIN Test ***");
    Integer year = 2014;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2015() {
    log.info("*** BEGIN Test ***");
    Integer year = 2015;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2016() {
    log.info("*** BEGIN Test ***");
    Integer year = 2016;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchAllByYear_2017() {
    log.info("*** BEGIN Test ***");
    Integer year = 2017;
    List<SeasonData> results = classUnderTest.fetchAllByYear(year);
    assertEquals(68, results.size());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2011() {
    log.info("*** BEGIN Test ***");
    Integer year = 2011;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2012() {
    log.info("*** BEGIN Test ***");
    Integer year = 2012;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2013() {
    log.info("*** BEGIN Test ***");
    Integer year = 2013;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    // Kentucky not in the big dance in 2013 
    /// (need to test when a requested team does not exist in the DB for that year)
    assertNull(result);
    
    teamName = "Duke";
    result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Duke", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2014() {
    log.info("*** BEGIN Test ***");
    Integer year = 2014;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2015() {
    log.info("*** BEGIN Test ***");
    Integer year = 2015;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2016() {
    log.info("*** BEGIN Test ***");
    Integer year = 2016;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

  @Test
  public void testFetchByYearAndTeamName_2017() {
    log.info("*** BEGIN Test ***");
    Integer year = 2017;
    String teamName = "Kentucky";
    SeasonData result = classUnderTest.fetchByYearAndTeamName(year, teamName);
    assertEquals("Kentucky", result.getTeamName());
    log.info("*** END Test ***");
  }

}
