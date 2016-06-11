package com.jonk.bean;

import java.util.Date;

import com.jonk.annotation.Row;

public class Student1 {

	// 如果Excel标题和属性名称一样，则可以不使用注解
	private String 姓名;

	@Row("年龄")
	// 对应Excel标题中的年龄列，以下类似
	private Integer age;

	@Row("生日")
	// 日期类型，默认格式为 yyyy-MM-dd HH:mm:ss
	private Date birthday;
	@Row("语文分数")
	private Double chineseScore;
	@Row("数学分数")
	private Double mathsScore;
	@Row("总分") // 对应Excel中的公式，既 总分 = 语文分数 + 数学分数
	private Double sumScore;

	public String get姓名() {
		return 姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(Double chineseScore) {
		this.chineseScore = chineseScore;
	}

	public Double getMathsScore() {
		return mathsScore;
	}

	public void setMathsScore(Double mathsScore) {
		this.mathsScore = mathsScore;
	}

	public Double getSumScore() {
		return sumScore;
	}

	public void setSumScore(Double sumScore) {
		this.sumScore = sumScore;
	}

	@Override
	public String toString() {
		return "Student1 [姓名=" + 姓名 + ", age=" + age + ", birthday=" + birthday + ", chineseScore=" + chineseScore
				+ ", mathsScore=" + mathsScore + ", sumScore=" + sumScore + "]";
	}
}
