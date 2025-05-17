public class User {
    String name;
    int id;
    
     public User(String name, int id){
        this.name=name;
        this.id=id;
     }
    
    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
} 