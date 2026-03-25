package cn.hangcrh.genshenelements.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class GenshinImpactElementsEnglishLangProvider extends FabricLanguageProvider {
    public GenshinImpactElementsEnglishLangProvider(FabricDataOutput dataOutput,
                                                    CompletableFuture<HolderLookup.Provider> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("effect.hangcrh-genshin-elements.wet","Wet");
        translationBuilder.add("effect.hangcrh-genshin-elements.pyro","Pyro");
        translationBuilder.add("effect.hangcrh-genshin-elements.cryo","Cryo");
        translationBuilder.add("effect.hangcrh-genshin-elements.electro","Electro");
        translationBuilder.add("effect.hangcrh-genshin-elements.dendro","Dendro");
    }
}