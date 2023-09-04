package Core;

import Abstractions.ItemGenerator;
import Rewards.BlackLabel.BlackLabelGenerator;
import Rewards.Diamonds.DiamondsGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new DiamondsGenerator());
        generatorList.add(new BlackLabelGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new BlackLabelGenerator());

        Random random = new Random();
        ItemGenerator myGenerator = generatorList.get(random.nextInt(generatorList.size()));
        String reward = myGenerator.openReward();
               if (reward.equalsIgnoreCase("Blacklabel")) {
                System.out.println(reward+" Конец игры!");
            } else  if(reward.equalsIgnoreCase("Gold")){
               System.out.printf(reward +" У Вас +40 очков" );
            } else if (reward.equalsIgnoreCase("Silver")) {
                   System.out.printf(reward + " У Вас +20 очков");
            } else if (reward.equalsIgnoreCase("Diamond")) {
                   System.out.printf(reward + " У Вас +60 очков");
            } else {
                   throw new RuntimeException( "Награда не определена " +reward);
            }
        }

    }
