package org.cloudburstmc.server.event.block;

import org.cloudburstmc.server.block.Block;
import org.cloudburstmc.server.event.Cancellable;
import org.cloudburstmc.server.player.Player;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class SignChangeEvent extends BlockEvent implements Cancellable {

    private final Player player;

    private String[] lines;

    public SignChangeEvent(Block block, Player player, String[] lines) {
        super(block);
        this.player = player;
        this.lines = lines;
    }

    public Player getPlayer() {
        return player;
    }

    public String[] getLines() {
        return lines;
    }

    public String getLine(int index) {
        return this.lines[index];
    }

    public void setLine(int index, String line) {
        this.lines[index] = line;
    }
}
