package xxrexraptorxx.extragems.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.VoxelShape;
import xxrexraptorxx.extragems.utils.Config;


public class BlockTopazCharged extends Block {

	public BlockTopazCharged() {
		super(BlockBehaviour.Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.lightLevel(value -> 5)
				.sound(SoundType.AMETHYST)
				.mapColor(MapColor.COLOR_YELLOW)
				.instrument(NoteBlockInstrument.BIT)
		);
	}

	protected static final VoxelShape CUSTOM_SHAPE = Block.box(0.03D, 0.0D, 0.3D, 15.7D, 15.7D, 15.7D);

	public static VoxelShape getCustomShape() {
		return CUSTOM_SHAPE;
	}

	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if(!level.isClientSide) {
			if(entity instanceof Player) {
				Player player = (Player) entity;
				player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Config.CHARGED_BLOCK_EFFECT_DURATION.get(), Config.CHARGED_BLOCK_EFFECT_AMPLIFIER.get()));
			}
			if(entity instanceof LivingEntity) {
				LivingEntity mob = (LivingEntity) entity;
				mob.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Config.CHARGED_BLOCK_EFFECT_DURATION.get(), Config.CHARGED_BLOCK_EFFECT_AMPLIFIER.get()));
			}
		}
	}

}