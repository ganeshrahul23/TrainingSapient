package com.sapient.def;

import java.util.List;

public interface IDao {
	void m1();
	void m2();
	default void m3(List<String> lst){
		
	}
}
