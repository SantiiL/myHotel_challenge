package com.myHotel.demo.Controller;

import com.myHotel.demo.Service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/employee-segment-a")
    public List<Object[]> countEmployeesInSegmentAByDepartment() {
        return departmentService.countEmployeesInSegmentAByDepartment();
    }

    @GetMapping("/employee-segment-b")
    public List<Object[]> countEmployeesInSegmentBByDepartment() {
        return departmentService.countEmployeesInSegmentBByDepartment();
    }

    @GetMapping("/employee-segment-c")
    public List<Object[]> countEmployeesInSegmentCByDepartment() {
        return departmentService.countEmployeesInSegmentCByDepartment();
    }

    @GetMapping("/employee-with-highest-salary")
    public List<Object[]> findEmployeeWithHighestSalaryByDepartment() {
        return departmentService.findEmployeeWithHighestSalaryByDepartment();
    }
}
