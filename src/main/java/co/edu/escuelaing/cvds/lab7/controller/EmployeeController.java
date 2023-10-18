package co.edu.escuelaing.cvds.lab7.controller;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public String listEmployers(Model m){
        List<Employee> list=employeeService.getAllEmployees();
        m.addAttribute("list",list);
        return "employee";
    }
    @GetMapping("/addEmployee")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }
    @PostMapping("/save")
    public String saveEmploye(@ModelAttribute("employee") Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employee";
    }
    @GetMapping("/update/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") String id, Model model) {

        Employee emp = employeeService.getEmployee(id);
        model.addAttribute("employee", emp);
        return "updateEmployee";
    }
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/employee";
    }
 //   @PostMapping("/delete/{id}")
 //   public String deleteEmployee(@PathVariable Long id) {
 //       employeeService.deleteEmployee(id);
 //       return "redirect:/employee";
 //   }
 @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
 public String delete(@PathVariable Long id){
     employeeService.deleteEmployee(id);
     return "redirect:/employee";
 }
}