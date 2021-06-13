package ex39;


import java.util.HashMap;
import java.util.Map;

public class solution39 {
    public static void main(String[] args) {

        Employee john = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee tou = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee michaela = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee jake = new Employee("Jake", "Jacobson", "Programmer", "");
        Employee jacquelyn = new Employee("Jacquelyn", "Jackson", "DBA", "");
        Employee sally = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        Map<String, Employee> staff = new HashMap<>();
        staff.put("johnKey", john);
        staff.put("touKey", tou);
        staff.put("michaelaKey", michaela);
        staff.put("jakeKey", jake);
        staff.put("jacquelynKey", jacquelyn);
        staff.put("sallyKey", sally);

        System.out.println(staff.values());
    }

}
