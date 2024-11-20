
import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private Map<ResourceType, Resource> strategies;

    public ResourceAllocator() {
        strategies = new HashMap<>();
        strategies.put(ResourceType.TIME_SLOT, new TimeSlotStrategy());
        strategies.put(ResourceType.SPACE_SLOT, new SpaceSlotStrategy());
    }

    public int allocate(ResourceType resourceType) {
        Resource strategy = strategies.get(resourceType);
        if (strategy == null) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
        int resourceId = strategy.findFreeResource();
        if (strategy.isFreeResource(resourceId)) {
            strategy.markResourceBusy(resourceId);
            return resourceId;
        }
        return INVALID_RESOURCE_ID;
    }

    public void free(ResourceType resourceType, int resourceId) {
        Resource strategy = strategies.get(resourceType);
        if (strategy != null) {
            strategy.markResourceFree(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }

    public int findFreeResource(ResourceType resourceType) {
        Resource strategy = strategies.get(resourceType);
        return strategy != null ? strategy.findFreeResource() : INVALID_RESOURCE_ID;
    }

    private static final int INVALID_RESOURCE_ID = -1;
}