package mindustry.world.meta;

import arc.graphics.*;
import mindustry.graphics.*;

public enum BlockStatus{
    active(Color.valueOf("00ff00")),
    lowActive(Color.valueOf("00ffff")),
    noOutput(Color.valueOf("ffff00")),
    noInput(Color.valueOf("ff0000")),
    logicDisable(Color.valueOf("0000ff"));

    public final Color color;

    BlockStatus(Color color){
        this.color = color;
    }
}
