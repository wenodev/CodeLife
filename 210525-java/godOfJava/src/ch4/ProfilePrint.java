package ch4;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsMarried(boolean isMarried){
        this.isMarried = isMarried;
    }

    public byte getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public boolean getIsMarried(){
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();

        profilePrint.setAge((byte) 31);
        profilePrint.setName("weno");
        profilePrint.setIsMarried(false);

        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.getIsMarried());
    }
}
