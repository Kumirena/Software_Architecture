package Rewards.Diamonds;

import Abstractions.IGameItem;

public class DiamondsRewards implements IGameItem {
    @Override
    public String open() {
        return "Diamond";
    }
}