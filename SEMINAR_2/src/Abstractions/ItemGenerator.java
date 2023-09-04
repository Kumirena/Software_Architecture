package Abstractions;

public abstract class ItemGenerator  {
    
    public String openReward() {
        IGameItem gameItem = creatItem();
        return gameItem.open();

    }
   
    public abstract IGameItem creatItem();
}