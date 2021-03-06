package com.wagner.employee_app.controller;

import com.wagner.employee_app.model.employee.Employee;
import com.wagner.employee_app.model.employee.EmployeeRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public final class MainApplicationFrameController {
  ////////////////////// region Variables  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private EmployeeRepository employeeRepository;
  // endregion
  ////////////////////// region Initialisation /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public MainApplicationFrameController(){
    this.employeeRepository = new EmployeeRepository();
  }
  // endregion
  ////////////////////// region Methods ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public List<Employee> getEmployeesByName(String searchText) throws SQLException{
    return this.employeeRepository.getAllWithNameLike(searchText);
  }

  public List<Employee> getAllEmployees() throws SQLException{
    return employeeRepository.getAll();
  }

  public Optional<Employee> getEmployee(Long id) throws SQLException{
    return employeeRepository.getById(id);
  }
  // endregion
  ////////////////////// region Inner Classes //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ////////////////////// End of Class //////////////////////////////////////////////////////////////////////////////////////////////////////////////// endregion
}