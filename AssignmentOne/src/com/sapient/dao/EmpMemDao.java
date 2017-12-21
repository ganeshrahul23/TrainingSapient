package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements Idao {
	
	public static Map<Integer, Emp> emap;
	
	static {
		emap = new HashMap<>();
		emap.put(1001, new Emp(1001, "Ganesh", 45650, 1, LocalDate.of(2014, 5, 21)));
		emap.put(1002, new Emp(1002, "Ramesh", 33650, 2, LocalDate.of(2012, 6, 22)));
		emap.put(1003, new Emp(1003, "Suresh", 47890, 1, LocalDate.of(2013, 4, 12)));
		emap.put(1004, new Emp(1004, "Prakash", 39860, 1, LocalDate.of(2011, 7, 9)));
		emap.put(1005, new Emp(1005, "Rakesh", 23560, 2, LocalDate.of(2012, 3, 11)));
	}
		 

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<>();		
		lst.addAll(emap.values());	
		return lst;
	}

	@Override
	public Emp viewEmployee(int eid) throws NotFoundException {		Emp emp = null;
		if(emap.containsKey(eid)){
			return emap.get(eid);
		}else{
			throw new NotFoundException("Employee not Found");
		}
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		if(emap.containsKey(emp.geteId())){
			throw new IdException("Id already exception");
		}else{
			emap.put(emp.geteId(), emp);
		}			
		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		if(emap.containsKey(eid)){
			emap.remove(eid);
		}else{
			throw new NotFoundException("Employee not Found");
		}
		return 1;
	}

	@Override
	public int updateSalary(int eid, double sal) throws NotFoundException {
		Emp emp = null;
		if(emap.containsKey(eid)){
		     emp = viewEmployee(eid);
		     emp.setSal(sal);
		     removeEmployee(eid);
		     try {
				addEmployee(emp);
			} catch (IdException e) {
				e.printStackTrace();
			}
		}else{
			throw new NotFoundException("Employee not Found");
		}
		return 1;
	}

}
