package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {
	
	
	// JPQL => Entity에 조회
	// quiz02 2번
	public List<RecruitEntity> findByCompanyId(int companyId);
	
	// quiz02 3번
	public List<RecruitEntity> findByPositionAndType(String positon, String Type);
	
	// quiz02 4번
	public List<RecruitEntity> findByTypeOrSalaryGreaterThan(String type, int salary);
	
	// quiz2 5번
	public List<RecruitEntity> findTop3ByTypeOrderBySalaryDesc(String type);
	
	// quiz2 6번
	public List<RecruitEntity> findByRegionAndSalaryBetween(String region, int startSalary, int endSalary);
	
	
	// quiz2 7번 - native query (DB에 직접 SQL)
	@Query(value = "select * from `recruit` "
			+ "where `deadline` > :deadline "
			+ "and `salary` >= :salary"
			+ "and `type` = :type "
			+ "order by `salary` desc"
			, nativeQuery = true)
	public List<RecruitEntity> findDeadlineAndSalaryAndType(
		@Param("deadline") String deadline,
		@Param("salary") int salary,
		@Param("type") String type);
		
}
