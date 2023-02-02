package com.myHotel.demo.Service;

import com.myHotel.demo.Model.Employee;
import com.myHotel.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Long countEmployeesInSegmentA() {
        return employeeRepository.countEmployeesInSegmentA();
    }

    public Long countEmployeesInSegmentB() {
        return employeeRepository.countEmployeesInSegmentB();
    }

    public Long countEmployeesInSegmentC() {
        return employeeRepository.countEmployeesInSegmentC();
    }

    public List<Object[]> findManagersHiredMoreThan15YearsAgo() {
        LocalDate fifteenYearsAgo = LocalDate.now().minusYears(15);
        return employeeRepository.findManagersHiredMoreThan15YearsAgo(fifteenYearsAgo);
    }

    public List<Object[]> findEmployeeInfoGroupedByCountry() {
        return employeeRepository.findEmployeeInfoGroupedByCountry();
    }
}


