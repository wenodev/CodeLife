package ch13;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(String name);
    public void print(String data){
        System.out.println("data : " + data);
    }
}
