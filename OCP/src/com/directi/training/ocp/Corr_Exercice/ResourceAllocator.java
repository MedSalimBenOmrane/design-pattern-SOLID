    package com.directi.training.ocp.exercise_refactored;

import java.util.Map;
import java.util.HashMap;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;
    private Map<ResourceType, ResourceStrategy> strategies;

    public ResourceAllocator() {
        strategies = new HashMap<>();
        strategies.put(ResourceType.TIME_SLOT, new TimeSlotStrategy());
        strategies.put(ResourceType.SPACE_SLOT, new SpaceSlotStrategy());
    }

    public int allocate(ResourceType resourceType) {
        ResourceStrategy strategy = strategies.get(resourceType);
        if (strategy == null) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
        int resourceId = strategy.findFreeResource();
        strategy.markResourceBusy(resourceId);
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) {
        ResourceStrategy strategy = strategies.get(resourceType);
        if (strategy == null) {
            System.out.println("ERROR: Attempted to free invalid resource");
            return;
        }
        strategy.markResourceFree(resourceId);
    }
}