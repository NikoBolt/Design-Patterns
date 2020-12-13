package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_1;

public interface PersonBean {
 
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating); // Накапливает среднюю оценку кандидита
}
