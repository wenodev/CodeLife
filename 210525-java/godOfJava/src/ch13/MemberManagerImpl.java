package ch13;

public class MemberManagerImpl extends MemberManagerAbstract{
    @Override
    public boolean addMember(String name) {
        return false;
    }

    @Override
    public void print(String data){
        System.out.println("data1 : " + data);
    }
}
