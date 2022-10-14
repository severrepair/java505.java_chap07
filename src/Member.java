public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age= age;
    }

//    Object 타입: 자바의 최상위 클래스
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
//            equals= 문자열끼리의 비교 할수있게 해준다.
            return member.name.equals(name) && (member.age == age);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

}
