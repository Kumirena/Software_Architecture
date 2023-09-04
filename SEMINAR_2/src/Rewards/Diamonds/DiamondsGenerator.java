package Rewards.Diamonds;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class DiamondsGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new DiamondsRewards();
    }
}