package com.hospital.dao;

import com.hospital.entity.HospitalEntity;

public interface HospitalDAO {
	void save(HospitalEntity entity);
	void getAll();
	void updateByIDDiseaseName(int id,String Diseasename);
	void updateByIDBill(int id, int Bill);
	void updateByIDage(int id, int age);
	void updateByIDName(int id,String name);
	void getData(int id);
	void deleteByID(int id);
}
