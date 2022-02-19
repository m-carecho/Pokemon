package pokemon;

import java.util.List;

public class Shop {
    private String name;
    private List<Item> sellableItemList;
    private List<Item> purchasableItemList;
    private Npc seller;

    public Shop() {
    }

    public Shop(String name, List<Item> sellableItemList, List<Item> purchasableItemList, Npc seller) {
        this.name = name;
        this.sellableItemList = sellableItemList;
        this.purchasableItemList = purchasableItemList;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getSellableItemList() {
        return sellableItemList;
    }

    public void setSellableItemList(List<Item> sellableItemList) {
        this.sellableItemList = sellableItemList;
    }

    public List<Item> getPurchasableItemList() {
        return purchasableItemList;
    }

    public void setPurchasableItemList(List<Item> purchasableItemList) {
        this.purchasableItemList = purchasableItemList;
    }

    public Npc getSeller() {
        return seller;
    }

    public void setSeller(Npc seller) {
        this.seller = seller;
    }
}
