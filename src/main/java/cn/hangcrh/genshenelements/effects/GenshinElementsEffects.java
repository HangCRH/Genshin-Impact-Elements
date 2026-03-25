package cn.hangcrh.genshenelements.effects;

import cn.hangcrh.genshenelements.GenshinImpactElements;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

public class GenshinElementsEffects {
    //所有生物效果在这个类注册
    /**
     * "潮湿"生物效果holder
     */
    public static final Holder<MobEffect> WET =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "wet"),
                    new WetEffect()
            );
    /**
     * "火元素附着"生物效果holder
     */
    public static final Holder<MobEffect> PYRO =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "pyro"),
                    new PyroEffect()
            );
    /**
     * "冰元素附着"生物效果holder
     */
    public static final Holder<MobEffect> CRYO =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "cryo"),
                    new CryoEffect()
            );
    /**
     * "雷元素附着"生物效果holder
     */
    public static final Holder<MobEffect> ELECTRO =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "electro"),
                    new ElectroEffect()
            );
    /**
     * "草元素附着"生物效果holder
     */
    public static final Holder<MobEffect> DENDRO =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(GenshinImpactElements.MOD_ID, "dendro"),
                    new DendroEffect()
            );

    public static void Initialize() {
        // ...
    }
}