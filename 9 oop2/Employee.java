/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 * excerise & solutions #18
 *
 **************************************************************************** */

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        if (firstname != null)
            this.firstname = firstname;//前面的指最上面的，后面的指employee method 里输入的值
        if (firstname != null)

            this.lastname = lastname;
        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0;


    }

    public void setFirstname(String name) {
        firstname = name;

    }

    public void setLastname(String name) {
        lastname = name;

    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0;

    }

    public String getFirstname() {
        return firstname;

    }

    public String getLastnamename() {
        return lastname;

    }

    public double getSalary() {
        return salary;

    }

}
