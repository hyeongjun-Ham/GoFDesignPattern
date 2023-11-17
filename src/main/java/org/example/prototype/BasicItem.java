package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class BasicItem implements Cloneable {

    private final BagInfo bagInfo;

    private final List<String> bag;

    public BasicItem(BagInfo bagInfo) {
        this.bagInfo = bagInfo;
        this.bag = new ArrayList<>();
    }

    public BagInfo getBagInfo() {
        return bagInfo;
    }

    public void add(String item) {
        bag.add(item);
    }

    public void remove(String item) {
        bag.remove(item);
    }

    public List<String> getBag() {
        return bag;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BagInfo bagInfo = new BagInfo();
        bagInfo.setBagName(this.bagInfo.getBagName());
        BasicItem basicItems = new BasicItem(bagInfo);
        basicItems.add("책상");
        basicItems.add("의자");
        basicItems.add("컴퓨터");
        basicItems.add("키보드");
        basicItems.add("등등");
        return basicItems;
    }

}
