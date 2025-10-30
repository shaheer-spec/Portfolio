package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(IValuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double total = 0;

        for (IValuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public IValuable getMostValuable(){
        IValuable mostValuable = assets.get(0);

        for (IValuable asset : assets) {
            if (asset.getValue() > mostValuable.getValue()){
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public IValuable getLeastValuable(){
        IValuable leastValuable = assets.get(0);

        for (IValuable asset : assets) {
            if (asset.getValue() < leastValuable.getValue()){
                leastValuable = asset;
            }
        }
        return leastValuable;
    }

}
