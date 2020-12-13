package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_2_javaproxy;

public interface PersonBean {
 
	String getName();
	String getGender();
	String getInterests();
	int getGeekRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating); // Накапливает среднюю оценку кандидита
 
}
