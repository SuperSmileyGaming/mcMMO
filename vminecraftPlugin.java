/**
 * vminecraft Plugin
 * @author Robert, TrapAlice
 */
//This is how we setup the listener
public class vminecraftPlugin extends Plugin {
    static final vminecraftListener listener = new vminecraftListener();

    public void enable() {
        //If we had commands we would add them here.
    }

    public void disable() {
        //And remove the commands here.
    }

    public void initialize() {
        //Here we add the hook we're going to use. In this case it's the arm swing event.
        etc.getLoader().addListener(PluginLoader.Hook.CHAT, listener, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.HIGH);
    }
}
