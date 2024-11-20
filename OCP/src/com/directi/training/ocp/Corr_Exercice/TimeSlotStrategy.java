public class TimeSlotStrategy implements ResourceStrategy {
    @Override
    public int markResourceBusy(int resourceId) {
        // Logique pour marquer un créneau horaire comme occupé
        return resourceId;
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Logique pour libérer un créneau horaire
    }

    @Override
    public int findFreeResource() {
        // Trouver un créneau horaire libre
        return 0;  // Supposons que 0 est un ID valide pour la démonstration
    }
}