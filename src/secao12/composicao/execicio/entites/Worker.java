/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.composicao.execicio.entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import secao12.composicao.execicio.entites.enums.WorkerLevel;

/**
 *
 * @author robson-pc
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    
    public void addCOntract(HourContract contract){
        contracts.add(contract);
    }
    
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    
    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int cYear  =  cal.get(Calendar.YEAR);
            int cMonth =  cal.get(Calendar.MONTH) + 1;
            if (cYear == year && cMonth == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartament() {
        return department;
    }

    public void setDepartament(Department departament) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    @Override
    public String toString() {
        return "Name=" + name + "\n"
             + "Department=" + department.getName();
    }
    
    
    
    
}
