package cn.hangcrh.genshenelements;

import cn.hangcrh.genshenelements.datagen.GenshinImpactElementsChineseLangProvider;
import cn.hangcrh.genshenelements.datagen.GenshinImpactElementsEnglishLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GenshinImpactElementsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(GenshinImpactElementsChineseLangProvider::new);
		pack.addProvider(GenshinImpactElementsEnglishLangProvider::new);
	}
}
