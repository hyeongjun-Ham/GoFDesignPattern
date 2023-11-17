package org.example.prototype;

public class Member {

    private final String name;

    private final String address;

    private final BasicItem basicItem;

    public Member(String name, String address, BasicItem basicItem) {
        this.name = name;
        this.address = address;
        this.basicItem = basicItem;
    }

    public void desc() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("지원 아이템 : " + basicItem.getBag());
        System.out.println("가방 이름 : " + basicItem.getBagInfo().getBagName());
    }
}
