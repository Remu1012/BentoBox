package world.bentobox.bentobox.hooks;

import org.dynmap.DynmapAPI;
import org.dynmap.markers.MarkerAPI;
import world.bentobox.bentobox.api.hooks.Hook;

/**
 * @author Poslovitch
 * @since 1.3.0
 */
public class DynmapHook extends Hook {

    private DynmapAPI dynmapAPI;
    private MarkerAPI markerAPI;

    public DynmapHook() {
        super("dynmap");
    }

    @Override
    public boolean hook() {
        dynmapAPI = (DynmapAPI) getPlugin();
        markerAPI = dynmapAPI.getMarkerAPI();

        return true;
    }

    @Override
    public String getFailureCause() {
        return "the version of dynmap you're using is incompatible with this hook";
    }
}
