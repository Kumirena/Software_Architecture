package Rewards.BlackLabel;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;


public class BlackLabelGenerator extends ItemGenerator {
    @Override
    public IGameItem creatItem() {
        return new BlackLabelRewerds();
    }
}