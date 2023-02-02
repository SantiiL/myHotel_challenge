package com.myHotel.demo.Repository;

import com.myHotel.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT COUNT(e) FROM Employee e WHERE e.salary < 3500")
    Long countEmployeesInSegmentA();

    @Query("SELECT COUNT(e) FROM Employee e WHERE e.salary >= 3500 AND e.salary < 8000")
    Long countEmployeesInSegmentB();

    @Query("SELECT COUNT(e) FROM Employee e WHERE e.salary >= 8000")
    Long countEmployeesInSegmentC();

    @Query("SELECT e.firstName, e.lastName, e.hireDate " +
            "FROM Employee e " +
            "WHERE e.job.jobTitle = 'Manager' " +
            "AND e.hireDate < :fifteenYearsAgo")
    List<Object[]> findManagersHiredMoreThan15YearsAgo(@Param("fifteenYearsAgo") LocalDate fifteenYearsAgo);

    @Query(value = "SELECT c.country_name AS country_name, COUNT(e.id) AS number_of_employees, AVG(e.salary) AS average_salary, MAX(e.salary) AS highest_salary, MIN(e.salary) AS lowest_salary, AVG(DATEDIFF(CURRENT_DATE, e.hire_date) / 365) AS average_seniority " +
            "FROM employees e " +
            "JOIN departments d ON e.department_id = d.department_id " +
            "JOIN locations l ON d.location_id = l.location_id " +
            "JOIN countries c ON l.country_id = c.country_id " +
            "GROUP BY c.country_name", nativeQuery = true)
    List<Object[]> findEmployeeInfoGroupedByCountry();

}
