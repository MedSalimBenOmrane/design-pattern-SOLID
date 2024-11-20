public class SpaceSlotStrategy implements Resource {
    @Override
    public boolean isFreeResource(int resourceId) {
        // Implementation details to check if the space slot is free
        return true; // Placeholder
    }

    @Override
    public void markResourceBusy(int resourceId) {
        // Mark the space slot as occupied
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Mark the space slot as free
    }

}