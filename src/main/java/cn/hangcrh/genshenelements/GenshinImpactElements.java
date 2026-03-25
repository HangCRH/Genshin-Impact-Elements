package cn.hangcrh.genshenelements;

import cn.hangcrh.genshenelements.effects.GenshinElementsEffects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class GenshinImpactElements implements ModInitializer {
	public static final String MOD_ID = "hangcrh-genshin-elements";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		GenshinElementsEffects.Initialize();
		ElementalReactionEvent.initialize();
		LOGGER.info("Hello Fabric world!");
	}
}
class ElementalReactionEvent{
	public static void initialize(){
		/*
		  注册新事件：end world tick
		  每维度tick结束时调用，参数为当前维度
		  用于给实体添加“碰到部分方块获得元素附着”效果
		 */
		ServerTickEvents.END_WORLD_TICK.register((world)->{
			for(Entity entity:world.getAllEntities()){	//遍历所有实体
				if(!(entity instanceof LivingEntity)){	//只需要给生物添加元素附着
					continue;
				}
				// 获取实体的碰撞箱
				AABB boundingBox = entity.getBoundingBox();

				// 遍历碰撞箱内的所有方块位置
				boolean found = false;
				for (BlockPos pos : BlockPos.betweenClosedStream(boundingBox).toList()) {
					if (world.getBlockState(pos).getBlock() == Blocks.WATER) {	//水方块
						found = true;
						break;
					}
				}

				if (found) {	// 触发事件
					var instance = new MobEffectInstance(	//效果的holder
							GenshinElementsEffects.WET,	//效果
							5*20,							//持续时间(tick)
							0,								//效果等级
							false,							//若为True会影响效果图标所以没用，尽管从语义来讲应该为True
							true,							//若为True显示粒子
							true							//若为True在hud上显示效果图标(不影响背包界面)
					);
					((LivingEntity) entity).addEffect(instance);
				}
			}
		});
	}
}