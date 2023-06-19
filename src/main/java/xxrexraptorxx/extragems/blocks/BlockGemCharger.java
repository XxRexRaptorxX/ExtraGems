package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class BlockGemCharger extends Block {

	public BlockGemCharger() {
		super(BlockBehaviour.Properties.of()
				.strength(4.0F, 8.0F)
				.lightLevel(value -> 8)
				.sound(SoundType.METAL)
				.mapColor(MapColor.COLOR_PURPLE)
				.instrument(NoteBlockInstrument.BIT)
		);
	}

}