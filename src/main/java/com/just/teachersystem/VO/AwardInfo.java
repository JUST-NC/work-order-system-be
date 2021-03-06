package com.just.teachersystem.VO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
@Setter
@Getter
@ToString
public class AwardInfo implements Serializable {
  private long aid;
  private String department;
  private String worknum;
  private String name;
  private String teammate;
  private String awardUnit;
  private String content;
  private String class1;
  private String class2;
  private String class3;
  private String level;
  private String prize;
  private double bonus;
  private String awardYear;
  private String certificate;
  private String awardTime;
  private String schoolYear;
  private String year;
  private long status=-2;
  private String reason;
  private Date lastTime;
}
