package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_2_javaproxy;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;

	// get-теры
	public String getName() { return name; }
	public String getGender() { return gender; }
	public String getInterests() { return interests; }

	// Вычисляет и возвращает среднюю оценку
	public int getGeekRating() {
		if (ratingCount == 0) return 0;
		return (rating/ratingCount);
	}

	// Set-теры
	public void setName(String name) { this.name = name;}
	public void setGender(String gender) { this.gender = gender; }
	public void setInterests(String interests) { this.interests = interests; }

	// увеличивает количество оценок и накапливает сумму оченок
	public void setGeekRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}
}
