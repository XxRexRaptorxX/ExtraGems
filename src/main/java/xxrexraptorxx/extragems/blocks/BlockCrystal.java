package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class BlockCrystal extends Block {

	public BlockCrystal() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.AMETHYST)
				.mapColor(MapColor.QUARTZ)
				.instrument(NoteBlockInstrument.BIT)
		);
	}

}
