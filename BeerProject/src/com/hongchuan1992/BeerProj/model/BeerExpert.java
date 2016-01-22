package com.hongchuan1992.BeerProj.model;

import java.util.*;
/**
 * Created by Zhang Hongchuan on 2016/1/8.
 * Beer Expert
 */
public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brand = new ArrayList<String>();
        if(color.equals("light")) {
            brand.add("Snow");
        }
        brand.add("TsingDao");
        return brand;
    }
}
