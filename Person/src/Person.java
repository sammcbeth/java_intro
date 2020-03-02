public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int new_age){
        if (new_age < 0 || new_age > 100){
            this.age = 0;
        }else {
            this.age = new_age;

        }
    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        else{
            return this.firstName + " " + this.lastName;

        }

    }

}
