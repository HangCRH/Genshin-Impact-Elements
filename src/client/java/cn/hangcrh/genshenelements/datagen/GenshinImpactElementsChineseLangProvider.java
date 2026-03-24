package cn.hangcrh.genshenelements.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class GenshinImpactElementsChineseLangProvider extends FabricLanguageProvider {
    public GenshinImpactElementsChineseLangProvider(FabricDataOutput dataOutput,
                                                    CompletableFuture<HolderLookup.Provider> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("effect.hangcrh-genshin-elements.wet","潮湿");
        translationBuilder.add("effect.hangcrh-genshin-elements.pyro","火元素附着");
    }
}