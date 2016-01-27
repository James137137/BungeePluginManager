package nz.co.lolnet.LolnetBungeePluginManager;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class LolnetBungeePluginManager extends Plugin {

	@Override
	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new Commands());
		ReflectionUtils.setFieldValue(ProxyServer.getInstance().getPluginManager(), "eventBus", new ModifiedPluginEventBus());
	}

}
