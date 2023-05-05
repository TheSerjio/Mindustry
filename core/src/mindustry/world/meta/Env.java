package mindustry.world.meta;

import arc.Core;

/** Environmental flags for different types of locations. */
public class Env{
    public static final int
    //is on a planet
    terrestrial = 1,
    //is in space, no atmosphere
    space = 1 << 1,
    //is underwater, on a planet
    underwater = 1 << 2,
    //has a spores
    spores = 1 << 3,
    //has a scorching env effect
    scorching = 1 << 4,
    //has oil reservoirs
    groundOil = 1 << 5,
    //has water reservoirs
    groundWater = 1 << 6,
    //has oxygen in the atmosphere
    oxygen = 1 << 7,
    //all attributes combined, only used for bitmasking purposes
    any = 0xffffffff,
    //no attributes (0)
    none = 0;

    public static final int[] singles = new int[]{terrestrial, space, underwater, spores, scorching, groundOil, groundWater, oxygen};

    public static String localize(int env){
        String result = "";
        if((env | terrestrial) == env)
            result += Core.bundle.get("env.terrestrial");
        if((env | space) == env)
            result += Core.bundle.get("env.space");
        if((env | underwater) == env)
            result += Core.bundle.get("env.underwater");
        if((env | spores) == env)
            result += Core.bundle.get("env.spores");
        if((env | scorching) == env)
            result += Core.bundle.get("env.scorching");
        if((env | groundOil) == env)
            result += Core.bundle.get("env.groundOil");
        if((env | groundWater) == env)
            result += Core.bundle.get("env.groundWater");
        if((env | oxygen) == env)
            result += Core.bundle.get("env.oxygen");
        return result;
    }
}