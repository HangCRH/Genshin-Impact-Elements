package cn.hangcrh.genshenelements.effects;

import cn.hangcrh.genshenelements.GenshinImpactElements;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

public class GenshinElementsEffects {
    //所有生物效果再这个类注册
    public static final Holder<MobEffect> HYDRO =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "hydro"),
                    new HydroEffect()
            );

    public static void Initialize() {
        // ...
    }
}