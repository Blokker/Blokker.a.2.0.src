package mods.blokker.client;

import mods.blokker.main.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
       
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
        }
       
}