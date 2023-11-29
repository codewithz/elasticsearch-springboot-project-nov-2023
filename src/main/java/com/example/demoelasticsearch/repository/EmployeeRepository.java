package com.example.demoelasticsearch.repository;

import com.example.demoelasticsearch.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
