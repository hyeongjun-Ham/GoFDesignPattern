package org.example.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        BagInfo bagInfo = new BagInfo();
        bagInfo.setBagName("기본");
        BasicItem basicItems = new BasicItem(bagInfo);
        basicItems.add("책상");
        basicItems.add("의자");
        basicItems.add("컴퓨터");
        basicItems.add("키보드");
        basicItems.add("등등");

        Member member = new Member("형준", "미사센텀비즈", basicItems);
        member.desc();
        System.out.println("===============================");

        BasicItem basicItems2 = (BasicItem) basicItems.clone();


        basicItems2.remove("키보드");

        bagInfo.setBagName("바뀜");

        Member newMember = new Member("철수", "서울", basicItems2);
        newMember.desc();

        System.out.println(basicItems != basicItems2);
        System.out.println(basicItems.getClass() == basicItems2.getClass());
        System.out.println(basicItems.getBagInfo() == basicItems2.getBagInfo());
    }
}
