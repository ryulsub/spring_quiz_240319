package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {
	
	public List<RecruitEntity> findAllByOrderByIdDesc();
	public List<RecruitEntity> findTop3ByOrderByIdDesc();
	public List<RecruitEntity> findByName(String name);
	public List<RecruitEntity> findByNameIn(List<String> names);
	public List<RecruitEntity> findByNameAndsize(String name, String size);
	public List<RecruitEntity> findByEmailContains(String keyword);
	public List<RecruitEntity> findByNameStartingWith(String keyword);
	public List<RecruitEntity> findByIdBetween(int startId, int endId);
}
