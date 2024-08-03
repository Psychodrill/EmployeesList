import java.util.*;

public class Employees {

    private Collection<Employee> employees= new LinkedList<Employee>();

    public void  addEmployee(Employee emp){
        this.employees.add(emp);
    }

    public Employee findTabNumber(int tabNum){

        Iterator<Employee> iterator = this.employees.iterator();
        boolean searchComplete = false;
        Employee resultEmp=null;
        while (iterator.hasNext() && !searchComplete) {
            if(iterator.next().getTabNumber()==tabNum){
                resultEmp = iterator.next();
                searchComplete=true;
            }
        }
        return resultEmp;
    }

    public Collection<Employee> findExperience(float minExperience){

        Collection<Employee> result = new LinkedList<Employee>();
        for (Employee employee : this.employees) {
            if(employee.getExperience()> minExperience){
                result.add(employee);
            }
        }
        return result;

    }

    public Collection<String> findPhoneNumber(String name){
        Collection<String> result = new LinkedList<String>();
        for (Employee employee : this.employees) {
            if(employee.getName().equals(name)){
                result.add(employee.getPhone());
            }
        }
        return result;
    }

}
