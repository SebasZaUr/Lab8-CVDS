package co.edu.escuelaing.cvds.lab7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String employee_id;
    @Column(name = "FIRTS_NAME")
    private String firts_name;
    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "ROLE")
    private String role;
    @Column(name = "SALARY")
    private float salary;

    public Employee() {
    }

    public Employee(String employee_id, String firts_name,String last_name,String role,float salary) {
        this.employee_id = employee_id;
        this.firts_name = firts_name;
        this.last_name = last_name;
        this.role = role;
        this.salary = salary;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirts_name() {
        return firts_name;
    }

    public void setFirts_name(String firts_name) {
        this.firts_name = firts_name;
    }
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
        result = prime * result + ((firts_name == null) ? 0 : firts_name.hashCode());
        result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((Float.toString(salary) == null) ? 0 : Float.toString(salary).hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employee_id == null) {
            if (other.employee_id != null)
                return false;
        } else if (!employee_id.equals(other.employee_id))
            return false;

        if (firts_name == null) {
            if (other.firts_name != null)
                return false;
        } else if (!firts_name.equals(other.firts_name))
            return false;

        if (last_name == null) {
            if (other.last_name != null)
                return false;
        } else if (!last_name.equals(other.last_name))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else return role.equals(other.role);

        return true;
    }

    @Override
    public String toString() {
        return "Employee [id = " + employee_id + ", name = " + firts_name + last_name +", role = "+ role + ", salary = "+ salary+"]";
    }
}
