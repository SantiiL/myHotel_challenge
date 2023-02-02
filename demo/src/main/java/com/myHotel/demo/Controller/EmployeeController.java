package com.myHotel.demo.Controller;

import com.myHotel.demo.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/segment-a")
    public Long countEmployeesInSegmentA() {
        return employeeService.countEmployeesInSegmentA();
    }

    @GetMapping("/segment-b")
    public Long countEmployeesInSegmentB() {
        return employeeService.countEmployeesInSegmentB();
    }

    @GetMapping("/segment-c")
    public Long countEmployeesInSegmentC() {
        return employeeService.countEmployeesInSegmentC();
    }

    @GetMapping("/managers")
    public List<Object[]> findManagersHiredMoreThan15YearsAgo() {
        return employeeService.findManagersHiredMoreThan15YearsAgo();
    }

    @GetMapping("/by-country")
    public List<Object[]> findEmployeeInfoGroupedByCountry() {
        return employeeService.findEmployeeInfoGroupedByCountry();
    }
}
