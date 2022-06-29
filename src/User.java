public class User {
    public int id;
    public String username,password,gender;

    public User(int id, String username, String password, String gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }
    public void login(String username,String password){
        System.out.println(username+"Giris yapildi.");
    }

}
