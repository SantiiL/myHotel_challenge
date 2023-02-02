package com.myHotel.demo.Repository;

import com.myHotel.demo.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT d.departmentName, COUNT(e) FROM Department d JOIN Employee e WHERE e.salary < 3500 GROUP BY d.departmentName")
    List<Object[]> countEmployeesInSegmentAByDepartment();

    @Query("SELECT d.departmentName, COUNT(e) FROM Department d JOIN Employee e WHERE e.salary >= 3500 AND e.salary < 8000 GROUP BY d.departmentName")
    List<Object[]> countEmployeesInSegmentBByDepartment();

    @Query("SELECT d.departmentName, COUNT(e) FROM Department d JOIN Employee e WHERE e.salary >= 8000 GROUP BY d.departmentName")
    List<Object[]> countEmployeesInSegmentCByDepartment();

    @Query("SELECT d.departmentName, MAX(e.salary), e.firstName, e.lastName " +
            "FROM Department d JOIN Employee e " +
            "GROUP BY d.departmentName, e.firstName, e.lastName")
    List<Object[]> findEmployeeWithHighestSalaryByDepartment();
}


