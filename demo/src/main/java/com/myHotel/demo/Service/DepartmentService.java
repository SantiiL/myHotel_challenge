package com.myHotel.demo.Service;

import com.myHotel.demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Object[]> countEmployeesInSegmentAByDepartment() {
        return departmentRepository.countEmployeesInSegmentAByDepartment();
    }

    public List<Object[]> countEmployeesInSegmentBByDepartment() {
        return departmentRepository.countEmployeesInSegmentBByDepartment();
    }

    public List<Object[]> countEmployeesInSegmentCByDepartment() {
        return departmentRepository.countEmployeesInSegmentCByDepartment();
    }

    public List<Object[]> findEmployeeWithHighestSalaryByDepartment() {
        return departmentRepository.findEmployeeWithHighestSalaryByDepartment();
    }
}

