public class Employee {
    private int id;
    private String name;
    private String designation;

    public void setId(int id){
        this.id= id;

    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }

    public String toString(int id, String name, String designation){
        return 
        "Id : "+id+" "
        +"Name "+name+" "
        +"Designation"+designation;

    }

    public String getDesignation() {
        return designation;
    }
}
