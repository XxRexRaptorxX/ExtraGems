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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.VoxelShape;
import xxrexraptorxx.extragems.utils.Config;


public class BlockCrystalCharged extends Block {

	public BlockCrystalCharged() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.STONE)
				.lightLevel(value -> 5)
		);
	}

	protected static final VoxelShape CUSTOM_SHAPE = Block.box(0.03D, 0.0D, 0.3D, 15.7D, 15.7D, 15.7D);

	public static VoxelShape getCustomShape() {
		return CUSTOM_SHAPE;
	}

	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if (!level.isClientSide) {
			if (entity instanceof Player) {
				Player player = (Player) entity;
				player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, Config.CHARGED_BLOCK_EFFECT_DURATION.get(), Config.CHARGED_BLOCK_EFFECT_AMPLIFIER.get()));
			}
			if (entity instanceof LivingEntity) {
				LivingEntity mob = (LivingEntity) entity;
				mob.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, Config.CHARGED_BLOCK_EFFECT_DURATION.get(), Config.CHARGED_BLOCK_EFFECT_AMPLIFIER.get()));
			}
		}
	}

}

