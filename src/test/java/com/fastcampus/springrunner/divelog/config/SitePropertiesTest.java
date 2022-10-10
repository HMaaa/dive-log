package com.fastcampus.springrunner.divelog.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SitePropertiesTest {

  @Test
  void test(@Autowired SiteProperties siteProperties) {
    assertThat(siteProperties.getAuthorName()).isEqualTo("kang-local");
    assertThat(siteProperties.getAuthorEmail()).isEqualTo("kjv4546@gmail.com");
  }

}