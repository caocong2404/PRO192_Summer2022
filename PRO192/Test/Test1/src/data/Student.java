
package data;


public class Student {
    private String code;
    private String name;
    private int age;
    private String address;
    
    public Student(String code, String name, int age, String address){
        this.code = code;
        this.name = name;
        this.age  = age;
        this.address = address;
    }
    
    public void showProfile(){
        System.out.printf("|%-8s|%-20s|%4d|%15s|\n", code, name, age, address);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
    
}
