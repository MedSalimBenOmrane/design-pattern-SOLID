public class TimeSlotStrategy implements Resource {
    @Override
    public boolean isFreeResource(int resourceId) {
        // Implementation details to check if the time slot is free
        return true; // Placeholder
    }

    @Override
    public void markResourceBusy(int resourceId) {
        // Mark the time slot as occupied
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Mark the time slot as free
    }
}